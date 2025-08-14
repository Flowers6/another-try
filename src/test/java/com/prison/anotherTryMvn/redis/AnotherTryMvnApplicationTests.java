package com.prison.anotherTryMvn.redis;

import com.prison.anotherTryMvn.dao.TestUser;
import com.prison.anotherTryMvn.service.TestUserService;
import jakarta.annotation.PostConstruct;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;
import org.springframework.data.redis.core.StringRedisTemplate;

import static com.prison.anotherTryMvn.constant.RedisKey.CACHE_NAME;

@SpringBootTest
class AnotherTryMvnApplicationTests {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private TestUserService testUserService;
    @Autowired
    CacheManager cacheManager;

    @Test
    void contextLoads() {
    }

    @Test
    public void testStringSetKey() {
        stringRedisTemplate.opsForValue().set("name:1", "123");
        stringRedisTemplate.opsForValue().set("name:2", "王炸");
        stringRedisTemplate.opsForValue().set("name:3", "mendo");

        System.out.println(stringRedisTemplate.opsForValue().get("name:3"));
    }

    @Test
    public void removeKey() {
        stringRedisTemplate.delete("name:3");
    }

    @Test
    public void tryCacheable() {
        String name = "grace";
        int count = 1;

        // 打印 Redis 中所有相关 key（便于观察）
        Runnable printKeys = () -> {
            System.out.println("当前 Redis 缓存 keys: " + stringRedisTemplate.keys("*testUser*"));
        };

        // 1️⃣ 先检查缓存是否存在 key grace（注意是完整缓存 key）
        String cacheKey = CACHE_NAME + "::" + name;
        if (stringRedisTemplate.hasKey(cacheKey)) {
            System.out.println("第" + count++ + "次存在 key 值为：" + cacheKey);
        }
        printKeys.run();

        // 2️⃣ 入参 null，不会存入缓存
        TestUser testUser = testUserService.selectByName(null);
        if (stringRedisTemplate.hasKey(cacheKey)) {
            System.out.println("第" + count++ + "次存在 key 值为：" + cacheKey);
        }
        printKeys.run();

        // 3️⃣ 入参 notExistUser，返回 null，也不会缓存
        TestUser notExistUser = testUserService.selectByName("notExistUser");
        if (stringRedisTemplate.hasKey(cacheKey)) {
            System.out.println("第" + count++ + "次存在 key 值为：" + cacheKey);
        }
        printKeys.run();

        // 4️⃣ 入参 grace，返回非空对象，会缓存
        TestUser grace = testUserService.selectByName(name);
        if (stringRedisTemplate.hasKey(cacheKey)) {
            System.out.println("第" + count++ + "次存在 key 值为：" + cacheKey);
        }
        printKeys.run();
    }

    @PostConstruct
    public void test() {
        System.out.println("当前 CacheManager 类型: " + cacheManager.getClass());
    }

}

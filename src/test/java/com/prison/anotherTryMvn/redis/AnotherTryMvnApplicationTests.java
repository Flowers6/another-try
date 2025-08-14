package com.prison.anotherTryMvn.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class AnotherTryMvnApplicationTests {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

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

}

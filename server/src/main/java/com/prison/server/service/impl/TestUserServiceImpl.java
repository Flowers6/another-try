package com.prison.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.prison.server.dao.TestUser;
import com.prison.server.service.TestUserService;
import com.prison.server.mapper.TestUserMapper;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import static com.prison.common.constant.RedisKey.CACHE_NAME;

/**
* @author 小王
* @description 针对表【test_user(测试用用户表)】的数据库操作Service实现
* @createDate 2025-08-14 17:44:58
*/
@Service
public class TestUserServiceImpl extends ServiceImpl<TestUserMapper, TestUser>
    implements TestUserService{

    /**
     * key 缓存的key值
     * value 缓存的名字
     * condition 用于入参的条件 满足条件才进行缓存
     * unless 用于出参的条件 满足条件不进行缓存
     */
    @Cacheable(value = CACHE_NAME, key = "#name", unless = "#result == null", condition = "(#name != null) and (!#name.isBlank())")
    @Override
    public TestUser selectByName(String name) {
        return this.lambdaQuery().eq(TestUser::getUsername, name).one();
    }

}





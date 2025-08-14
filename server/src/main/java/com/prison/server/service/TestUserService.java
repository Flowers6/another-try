package com.prison.server.service;

import com.prison.server.dao.TestUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 小王
* @description 针对表【test_user(测试用用户表)】的数据库操作Service
* @createDate 2025-08-14 17:44:58
*/
public interface TestUserService extends IService<TestUser> {

    TestUser selectByName(String name);

}

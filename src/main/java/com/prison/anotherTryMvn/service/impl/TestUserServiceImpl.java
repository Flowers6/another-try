package com.prison.anotherTryMvn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.prison.anotherTryMvn.dao.TestUser;
import com.prison.anotherTryMvn.service.TestUserService;
import com.prison.anotherTryMvn.mapper.TestUserMapper;
import org.springframework.stereotype.Service;

/**
* @author 小王
* @description 针对表【test_user(测试用用户表)】的数据库操作Service实现
* @createDate 2025-08-14 09:44:01
*/
@Service
public class TestUserServiceImpl extends ServiceImpl<TestUserMapper, TestUser>
    implements TestUserService{

}





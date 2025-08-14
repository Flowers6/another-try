package com.prison.mybatis_plus;

import com.prison.server.dao.TestUser;
import com.prison.server.service.TestUserService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RequiredArgsConstructor
public class MybatisPlusTest {

    @Autowired
    private TestUserService testUserService;

    @Test
    public void testRead() {
        TestUser testUser = testUserService.lambdaQuery().eq(TestUser::getId, 1).one();
        System.out.println(testUser);
    }

}

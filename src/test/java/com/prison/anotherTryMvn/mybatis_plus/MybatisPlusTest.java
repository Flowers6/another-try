package com.prison.anotherTryMvn.mybatis_plus;

import com.prison.anotherTryMvn.dao.TestUser;
import com.prison.anotherTryMvn.service.TestUserService;
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

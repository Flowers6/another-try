package com.prison.anotherTryMvn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.prison.anotherTryMvn"})
@MapperScan("com.prison.anotherTryMvn.mapper")
public class AnotherTryMvnApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnotherTryMvnApplication.class, args);
    }

}

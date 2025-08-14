package com.prison.anotherTryMvn.config;

import org.redisson.spring.starter.RedissonAutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfiguration;

/**
 * @author : Flowers6
 * @version : v1.0
 * @description :
 * @date : 2025/8/11
 * @time : 21:20
 */
@AutoConfiguration(before = RedissonAutoConfiguration.class)
public class RedisConfiguration {

}

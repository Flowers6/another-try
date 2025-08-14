package com.prison;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.prison.**.*"})
@MapperScan("com.prison.server.mapper")
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}

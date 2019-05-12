package com.byqj.byqjplatformspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ByqjPlatformSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ByqjPlatformSpringApplication.class, args);
    }

}

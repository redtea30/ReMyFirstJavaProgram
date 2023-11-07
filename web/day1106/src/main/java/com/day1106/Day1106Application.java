package com.day1106;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class Day1106Application {

    public static void main(String[] args) {
        SpringApplication.run(Day1106Application.class, args);
    }

}

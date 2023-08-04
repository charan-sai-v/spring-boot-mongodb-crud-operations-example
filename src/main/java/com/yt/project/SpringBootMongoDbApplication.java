package com.yt.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.yt.project")
public class SpringBootMongoDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMongoDbApplication.class, args);
    }

}

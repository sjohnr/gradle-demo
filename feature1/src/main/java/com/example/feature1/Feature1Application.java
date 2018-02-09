package com.example.feature1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.example.common.entity")
@EnableJpaRepositories(basePackages = "com.example.common.repository")
public class Feature1Application {
    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Feature1Application.class, args);
    }
}

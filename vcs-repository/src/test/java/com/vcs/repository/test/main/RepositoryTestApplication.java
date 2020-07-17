package com.vcs.repository.test.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.vcs.model")
@EnableJpaRepositories("com.vcs.repository")
public class RepositoryTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RepositoryTestApplication.class, args);
    }
}
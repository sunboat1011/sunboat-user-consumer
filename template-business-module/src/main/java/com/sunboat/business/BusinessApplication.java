package com.sunboat.business;

import com.sunboat.common.utils.CommonUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BusinessApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BusinessApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(CommonUtils.getMessage());
    }
}    
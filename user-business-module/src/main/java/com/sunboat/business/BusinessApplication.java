package com.sunboat.business;

import com.sunboat.common.utils.CommonUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sunboat.business.maper")
public class BusinessApplication implements CommandLineRunner {


//    @Value("${spring.profiles.active}")
//    private String activeProfile;

    public static void main(String[] args) {
        SpringApplication.run(BusinessApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println(activeProfile);
        System.out.println(CommonUtils.getMessage());
    }
}    
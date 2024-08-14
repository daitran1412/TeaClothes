package com.daitd.teaclothes;

import org.springframework.boot.SpringApplication;

public class TestTeaClothesApplication {

    public static void main(String[] args) {
        SpringApplication.from(TeaClothesApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}

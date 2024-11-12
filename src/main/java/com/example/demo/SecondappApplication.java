package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
//        scanBasePackages = {"com.example.demo",
//                "com.example.util"}
// Эти две верхние, закомментированные строки кода
// предназначены для сканирования недефолтных пакетов
)
public class SecondappApplication {

    public static void main(String[] args) {

        SpringApplication.run(SecondappApplication.class, args);
    }

}

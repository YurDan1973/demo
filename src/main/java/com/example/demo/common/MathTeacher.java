package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
// Эта аннотация говорит Spring-у что при запуске приложения необходимо
// будет создать экземпляр нижеуказанного (именно под аннотацией) класса
public class MathTeacher implements Teacher {

    @Override
    public String getHomeWork() {
        return "Решать уравнения.";
    }
}

package com.example.demo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
// Эта аннотация говорит Spring-у что при запуске приложения необходимо
// будет создать экземпляр нижеуказанного (именно под аннотацией) класса
//@Lazy
public class MathTeacher implements Teacher {
    public MathTeacher() {
        System.out.println("Bean of class - " + this.getClass().getSimpleName());
    }

    @Override
    public String getHomeWork() {
        return "Решать уравнения.";
    }
}

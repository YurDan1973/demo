package com.example.demo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// Эта аннотация говорит Spring-у что при запуске приложения необходимо
// будет создать экземпляр нижеуказанного (именно под аннотацией) класса
//@Lazy
//@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MathTeacher implements Teacher {
    public MathTeacher() {
        System.out.println("Bean of class - " + this.getClass().getSimpleName());
    }
//    @PostConstruct
//    // Эта аннотация говорит о том, что этот метод вызывается после создания конструктора
//    public void myFirstMethod() {
//        System.out.println("myFirstMethod");
//    }

//    @PreDestroy
//    // Эта аннотация говорит о том, что этот метод вызывается после того как мы завершаем
//    // действие бина, т.е. когда мы останавливаем наше приложение
//    public void myLastMethod() {
//        System.out.println("myLastMethod");
//    }
//    // Этот метод отрабатывает только если мы используем pattern проектирования  Singleton

    @Override
    public String getHomeWork() {
        return "Решать уравнения.";
    }
}

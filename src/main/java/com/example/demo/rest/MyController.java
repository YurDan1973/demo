package com.example.demo.rest;

import com.example.demo.common.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Lazy
public class MyController {

    private Teacher teacher;
//    private Teacher secondTeacher;

    @Autowired
// Эта аннотация над конструктором говорит о том, что если
// нижеследующему MyController - ру понадобится объект, указанный в параметрах, т.е. Teacher teacher
// то Spring её создат сам и подтянет её
//    public MyController(@Qualifier("mathTeacher") Teacher teacher
    public MyController(@Qualifier("englishTeacher") Teacher teacher
// , @Qualifier("mathTeacher") Teacher secondTeacher
    ) {
//    public MyController(Teacher teacher) {
        System.out.println("Bean of class - " + this.getClass().getName());
        this.teacher = teacher;
//        this.secondTeacher = secondTeacher;
    }

//    @Autowired
//    public void setTeacher(Teacher teacher) {
////    или     public void testMethod (Teacher teacher) {
//        this.teacher = teacher;
//    }

    @GetMapping("/homework")
    // Эта аннотация нужна для того чтобы проверить действие на какой-то странице
    public String getHomeWork() {
        return teacher.getHomeWork();
    }

//    @GetMapping("/compteachers")
//    public String compareTeachers() {
//        return "Compareteachers - " + (teacher == secondTeacher);
//    }
}
// Последнее изменение
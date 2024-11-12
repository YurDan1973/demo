package com.example.demo.rest;

import com.example.demo.common.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private Teacher teacher;

//    @Autowired
//// Эта аннотация над конструктором говорит о том, что если
//// нижеследующему MyController - ру понадобится объект, указанный в параметрах, т.е. Teacher teacher
//// то Spring её создат сам и подтянет её
//    public MyController(Teacher teacher) {
//
//        this.teacher = teacher;
//    }

//    @Autowired
//    public void setTeacher(Teacher teacher) {
////    или     public void testMethod (Teacher teacher) {
//        this.teacher = teacher;
//    }

    @GetMapping("/homework")
    public String getHomeWork() {

        return teacher.getHomeWork();
    }
}

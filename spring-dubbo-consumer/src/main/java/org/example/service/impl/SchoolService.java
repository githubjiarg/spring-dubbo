package org.example.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import org.example.module.StudentBean;
import org.example.module.TeacherBean;
import org.example.service.StudentService;
import org.example.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

public class SchoolService {

    /**
     *  此处通过dubbo公共接口调用其具体的实现类
     *  需要用到dubbo的reference调用远程接口。
     */
    private TeacherService teacherService;

    private StudentService studentService;

    public TeacherBean queryTeacher(){

        return teacherService.queryTeacher("郭德纲");
    }

    public StudentBean queryStudent(){

        return studentService.queryStudent("岳云鹏");
    }


    public TeacherService getTeacherService() {
        return teacherService;
    }

    public void setTeacherService(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }
}

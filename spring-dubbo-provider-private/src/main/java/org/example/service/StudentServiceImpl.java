package org.example.service;

import org.example.module.StudentBean;
import org.springframework.stereotype.Service;

import java.util.UUID;

public class StudentServiceImpl implements StudentService {

    @Override
    public StudentBean queryStudent(String name) {
        StudentBean studentBean = new StudentBean();
        studentBean.setStudentId(UUID.randomUUID().toString());
        studentBean.setHeight("175cm");
        studentBean.setPhone("17186144054");
        studentBean.setWeight("65kg");
        studentBean.setStudentName(name);
        studentBean.setAdd("南京市建邺区");
        return studentBean;
    }
}

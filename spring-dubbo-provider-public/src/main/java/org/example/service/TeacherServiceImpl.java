package org.example.service;
import org.example.module.TeacherBean;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @Service 注解使用dubbo的注解，
 * 用于实现接口并将其暴漏给调用者
 */

public class TeacherServiceImpl implements TeacherService{
    @Override
    public TeacherBean queryTeacher(String name) {
        TeacherBean teacherBean = new TeacherBean();
        teacherBean.setTeacherId(UUID.randomUUID().toString());
        teacherBean.setTeacherName(name);
        teacherBean.setDiploma("本科");
        teacherBean.setMajor("计算机");
        teacherBean.setGender("男");
        return teacherBean;
    }
}

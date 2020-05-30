package org.example.service;

import org.example.module.StudentBean;

/**
 *  学生业务
 */
public interface StudentService {

    StudentBean queryStudent(String name);
}

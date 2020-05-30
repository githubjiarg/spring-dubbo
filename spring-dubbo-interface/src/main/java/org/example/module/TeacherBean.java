package org.example.module;

import lombok.Data;

import java.io.Serializable;

/**
 *  教师信息
 */
@Data
public class TeacherBean implements Serializable {

    private String teacherId;

    private String teacherName;

    private String gender;

    private String major;

    private String diploma;

}

package org.example.module;

import lombok.Data;

import java.io.Serializable;

@Data
public class StudentBean implements Serializable {

    private String studentId;

    private String studentName;

    private String height;

    private String weight;

    private String phone;

    private String add;

}

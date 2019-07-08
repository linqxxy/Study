package com.inqxxy.git;

import java.io.Serializable;

class Teacher{
    private String name;
    private Integer age;
}
class Student extends Teacher implements Serializable {
    private String name;
    private Integer age;
    private Teacher teacher;
    public Student clone(){
        Student stu=null;
        try {
            stu= (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return stu;
    }
}


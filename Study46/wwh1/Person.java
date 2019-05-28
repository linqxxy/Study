package com.linqxxy.git.wwh1;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

public class Person implements Serializable {
    private String name;
    private Integer age;
    private String[] skill;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String[] getSkill() {
        return skill;
    }

    public void setSkill(String[] skill) {
        this.skill = skill;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skill=" + Arrays.toString(skill) +
                ", birthday=" + birthday +
                '}';
    }
}

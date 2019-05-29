package com.linqxxy.git.wwh;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class Person implements Serializable {
    private String name;
    private Integer age;
    private String[] skill;
    private Date birthday;
    public Person(String name,Integer age){
        this.age=age;
        this.name=name;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age) &&
                Arrays.equals(skill, person.skill) &&
                Objects.equals(birthday, person.birthday);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(name, age, birthday);
        result = 31 * result + Arrays.hashCode(skill);
        return result;
    }
}

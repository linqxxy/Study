package com.linqxxy.git.wwh2;

public class Student extends Person{
    private String school;
    private int birthday;
    private String skill;
    public Student(){}
    public Student(String school, int birthday, String skill){
        this.school=school;
        this.skill=skill;
        this.birthday=birthday;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Student{" +
                "school='" + school + '\'' +
                ", birthday=" + birthday +
                ", skill='" + skill + '\'' +
                '}';
    }
}

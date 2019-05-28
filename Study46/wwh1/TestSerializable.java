package com.linqxxy.git.wwh1;

import java.io.*;
import java.util.Date;

public class TestSerializable {
    public static void main1(String[] args) {
        Person person =new Person();
        person.setAge(20);
        person.setName("Tom");
        person.setBirthday(new Date());
        person.setSkill(new String[]{"C++","C"+"java"});
        try {
            ObjectOutputStream oout =new ObjectOutputStream(new FileOutputStream("F:"+ File.separator+"test"+File.separator+"Person.data"));
            oout.writeObject(person);
            oout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try
            (ObjectInputStream oint =new ObjectInputStream(new FileInputStream("F:"+ File.separator+"test"+File.separator+"Person.data"))){
            try {
                Object obj = oint.readObject();
                Person person=(Person) obj;
                System.out.println(person);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

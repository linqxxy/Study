package com.linqxxy.git.wwh1;
import com.linqxxy.git.wwh.Person;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main1(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("java");
        set.add("paython");
        set.add("rust");
        set.add("JavaScript");
        set.add("C");
        set.add("C++");
        set.add("PHP");
        System.out.println("集合元素个数"+set.size());
        System.out.println("集合是否为空"+set.isEmpty());
        System.out.println("集合元素"+set);
        System.out.println(""+set.remove("PHP"));
    }
    public static void main2(String[] args) {
        Set<String> set=new TreeSet<>();
        set.add("java");
        set.add("paython");
        set.add("rust");
        set.add("JavaScript");
        set.add("C");
        set.add("C++");
        set.add("PHP");
        System.out.println("集合元素个数"+set.size());
        System.out.println("集合是否为空"+set.isEmpty());
        System.out.println("集合元素"+set);
        System.out.println(""+set.remove("PHP"));
    }

    public static void main(String[] args) {
        Set<Person> people=new TreeSet<>(Comparator.comparingInt(Person::getAge));
        people.add(new Person("张三",18));
        people.add(new Person("Tom",21));
        people.add(new Person("Terry",22));
        people.add(new Person("jack",19));
        people.add(new Person("Z",17));
        System.out.println(people);
    }
}

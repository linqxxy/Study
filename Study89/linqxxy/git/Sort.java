package com.linqxxy.git;

import java.util.*;
public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int option = sc.nextInt();//排序方法
            List<Person> list = new ArrayList<>();
            for(int i=0; i<n; i++){
                list.add(new Person(sc.next(),sc.nextInt()));
            }
            if(option == 0){//降序
                list.sort((o1,o2) -> o2.score-o1.score);
            }else if(option == 1){
                list.sort(Comparator.comparingInt(o -> o.score));
            }
            for(Person person :list ){
                System.out.println(person.name+" "+person.score);
            }
        }
    }
}
class Person{
    public String name;
    public int score;

    public Person(String name,int score) {
        this.name = name;
        this.score = score;
    }
}

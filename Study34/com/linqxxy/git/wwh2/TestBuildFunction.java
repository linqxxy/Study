package com.linqxxy.git.wwh2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestBuildFunction {
    public static void main1(String[] args) {
        Function<Integer,String> function=String::valueOf;
        System.out.println(function.apply(10));
        TestBuildFunction.print(String::valueOf,20);
    }

    public static void main2(String[] args) {
        Supplier<String> supplier=()->"Hello World";
        System.out.println(supplier.get());
        TestBuildFunction.print1(supplier);
    }

    public static void main3(String[] args) {
        Consumer<String> consumer=System.out::println;
        consumer.accept("Hello");
    }

    public static void main4(String[] args) {
        Predicate<String> predicate=(x)->{
            if(x==null){
                return false;
            }else {
                return x.length()>2;
            }
        };
        System.out.println(predicate.test("ABCC"));
        System.out.println(predicate.test(null));
    }

    public static void main(String[] args) {
        Supplier<String> supplier=()->String.valueOf(Math.round(Math.random()*10+1));
        Predicate<Supplier<String>> predicate=(s)->{
            String value=s.get();
            if(value==null){
                return false;
            }else {
                return value.length()>2;
            }
        };
        System.out.println(supplier.get());
        System.out.println(predicate.test(supplier));
    }
    public  static void print1(Supplier<?> supplier){
        System.out.println(supplier.get());
    }
    public static void print(Function<Integer,String>function,Integer p){
        System.out.println(function.apply(p));
    }
}

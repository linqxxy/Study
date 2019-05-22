package com.lineqxxy.git.wwh5;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Factory<T> {
   private Factory(){}
   public static <T> T getInstance(String className){
     T t = null;
       try {
           try {
               t= (T) Class.forName(className).newInstance();
           } catch (InstantiationException e) {
               e.printStackTrace();
           } catch (IllegalAccessException e) {
               e.printStackTrace();
           }
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
       return t;
   }
   public static <T> T getInstance(String className,Object obj){
       T t=null;
       try {
           Constructor con = Class.forName(className).getConstructor(obj.getClass().getInterfaces());
           try {
               t= (T) con.newInstance(obj);
           } catch (InstantiationException e) {
               e.printStackTrace();
           } catch (IllegalAccessException e) {
               e.printStackTrace();
           } catch (InvocationTargetException e) {
               e.printStackTrace();
           }
       } catch (NoSuchMethodException e) {
           e.printStackTrace();
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
       return t;
   }
}
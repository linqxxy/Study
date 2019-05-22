package com.lineqxxy.git.wwh4;

import java.lang.reflect.Field;

public class BeanUtils {
    public static void copy (Object source,Object target){
     if(source==null){
         throw new IllegalArgumentException("source can not be null");
     }
     if(target==null){
         throw new IllegalArgumentException("target can not be null");
     }
        Class sourceCls=source.getClass();
        Class targetCls=target.getClass();
        Field[] sourceFields=sourceCls.getDeclaredFields();
        Field[] targetFields=targetCls.getDeclaredFields();
        for (Field s:
             sourceFields) {
            for (Field t:
                 targetFields) {
                if(s.getName().equals(s.getName())&&
                        s.getType()==t.getType()){
                    s.setAccessible(true);
                    t.setAccessible(true);
                    Object value= null;
                    try {
                        value = s.get(source);
                        t.set(target,value);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
                break;
            }
        }
    }
}

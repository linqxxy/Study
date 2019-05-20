package com.linqxxy.git.wwh1;

import java.lang.reflect.Constructor;

class Factory {
    private Factory() {
    }

    public static <T> T getInstance(String className) {
        T t = null;
        try {
            t = (T) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return t;
    }
    public static <T> T getInstance(String className,Object obj) {
        T t = null ;
        try {
            Constructor<?> cons =
                    Class.forName(className).getConstructor(obj.getClass().getInterfaces()[0]) ;
            t = (T) cons.newInstance(obj) ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t ;
    }
}

package com.lineqxxy.git.wwh3;

import java.io.File;

public class TestDirectory {
    public static void main(String[] args) {
        File directory =new File("F:"+File.separator+"test");
        int level=0;
        printDirectory(directory,level);
    }
    public static void printDirectory (File file,int level){
        System.out.print("|");
        if(file.isFile()){
            System.out.println(addSpace(level)+file.getName());
        }else{
            System.out.println(space(level)+file.getAbsoluteFile());
            File[] files=file.listFiles();
            if(files!=null){
                for(File f:files){
                    printDirectory(f,level+2);
                }
            }
        }
    }
    private static String addSpace(int level){
        StringBuffer sp=new StringBuffer();
        sp.append("|");
        for(int i=0;i<level;i++){
            sp.append("——");
        }
        return sp.toString();
    }
    private static String space(int level){
        StringBuffer sp=new StringBuffer();
        for (int i=0;i<level;i++){
            sp.append("     ");
        }
        return sp.toString();
    }
}

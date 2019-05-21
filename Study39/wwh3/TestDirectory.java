package com.lineqxxy.git.wwh3;

import java.io.File;

public class TestDirectory {
    public static void main(String[] args) {
        File directory =new File("F:"+File.separator+"test");
        int level=0;
        printDirectory(directory,level);
    }
    public static void printDirectory (File file,int level){
        if(file.isFile()){
            System.out.println(file.getAbsoluteFile());
        }else{
            System.out.println(file.getAbsoluteFile());
            File[] files=file.listFiles();
            if(files!=null){
                for(File f:files){
                    printDirectory(f,level);
                }
            }
        }
    }
    private static String space(int level){
        StringBuffer sp=new StringBuffer();
        for (int i=0;i<level;i++){
            sp.append(" ");
        }
        return sp.toString();
    }
}

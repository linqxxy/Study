package com.lineqxxy.git.wwh2;
/*
* 1.Windows 中 文件名不区分大小写
* 文件分隔符:\
* 路径分隔符:    ;
* 2.Linux/UNIX  中 区分大小写
* 文件分隔符 /
* 路径分隔符:    :
*
* 3.建议：（1）文件名小写，主观上不要用大小写区分不同的文件。
* （2）文件名中不要出现特殊字符，空格
* （3）尽量不要用中文路径
*/

import java.io.File;
//import java.io.IOException;
import java.util.Date;

public class TestFile {
//    public static void main1(String[] args) {
//        File file =new File("F:"+File.separator+"test"+"Hello.java");
//        try {
//            boolean effect =file.createNewFile();
//            if(effect){
//                System.out.println("文件创建成功");
//            }else{
//                if(file.exists()){
//
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main2(String[] args) {
//        File  directory=new File("F:"+File.separator+"test"+File.separator+"javaCode"+File.separator+"jaavse521");
//        if(directory.exists()){
//            System.out.println("目录存在");
//        }else{
//            //directory.mkdirs();//如果目录不存在，并且父目录也不存在，一并创建；
//            boolean effect =directory.mkdirs();
//            if(effect){
//                System.out.println("创建成功");
//            }else{
//                System.out.println("创建失败");
//            }
//        }
//    }

    public static void main(String[] args) {
        File directory=new File("F:"+File.separator+"test"+File.separator+"javaCode"+File.separator+"jaavse521");
        if(directory.isDirectory()){
            String[] files=directory.list((f,n)-> n.endsWith("txt"));
            if(files!=null){
                for(String f:files){
                    System.out.println(f);
                }
            }
        }
        System.out.println("文件名"+directory.getName());
        System.out.println("是否是文件"+directory.isFile());
        System.out.println("是否是目录"+directory.isDirectory());
        System.out.println("是否是隐藏文件"+directory.isHidden());
        System.out.println("文件大小"+directory.length());
        System.out.println("最后修改时间"+new Date(directory.lastModified()));
        System.out.println("是否能执行"+directory.canWrite());
        System.out.println("是否能读"+directory.canRead());
    }
}

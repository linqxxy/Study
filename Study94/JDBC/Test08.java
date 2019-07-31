package com.linqxxy.test;

import java.util.Scanner;
public class Test08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            String str = sc.nextLine();
            String str2 = sc.nextLine();
            System.out.println(IpToTen(str));
            TenToIp(str2);
        }
        sc.close();
    }
    public static void TenToIp(String s){
        long tmp = Long.parseLong(s);
        String ip = Long.toBinaryString(tmp);
        StringBuffer sb = new StringBuffer();
        while (ip.length() < 32)
            ip = "0" + ip;
        ip = ip.substring(ip.length() - 32);
        sb.append(ip);

        for (int i = 0; i < sb.length() - 8; i += 8)
            System.out.print(Integer.parseInt(sb.substring(i, i + 8), 2) + ".");

        System.out.println(Integer.parseInt(sb.substring(sb.length() - 8), 2));

    }
    public static Long IpToTen(String ip){

        String[] arr = ip.split("\\.");

        long n = Long.parseLong(arr[0]);

        for (int i = 1; i < arr.length; i++) {

            n <<= 8;
            n += Long.parseLong(arr[i]);

        }
        return n;
    }
}

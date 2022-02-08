package com.me;

import javax.security.sasl.SaslClient;
import javax.xml.transform.Result;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Keywordlong30 {

    public static void main(String[] args) {
        System.out.println("enter the days");
        Scanner scan=new Scanner(System.in);
        long lng=scan.nextLong();
       // int days;
       // long seconds;
       // long min;
        int days=2;
        long seconds=60;
        long min=20;
        long result=days*seconds*min;
        System.out.println(result);



    }
}

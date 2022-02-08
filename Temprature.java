package com.me;

import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
    //   System.out.println(" Enter the temp");
     //   Scanner scan=new Scanner(System.in);
     //   float temp = scan.nextFloat();
     //   float tempC=(temp * 9/5)+32;
     //   System.out.println(tempC);

        System.out.println("enter the value for kilometer");
        Scanner scan=new Scanner(System.in);
        Scanner tempconv = new Scanner(System.in);
        double kilometer;
        double miles;
        double convertion=1.609344;
        kilometer=tempconv.nextDouble();
        miles = kilometer / convertion;
        System.out.println(miles);


    }
}

package com.me;

public class Unaryprogm {
    public static void main(String[] args) {
        int a=8;

        System.out.println(" post " + " incr = " + a++);
        System.out.println(" pre " + "incr = " + ++a);

 //21)difference between post and prefix
        int i = 3;
        i++;
        System.out.println(i);    // "4"
        ++i;
        System.out.println(i);    // "5"
        System.out.println(++i);  // "6"
        System.out.println(i++);  // "6"
        System.out.println(i);    // "7"
    }
}


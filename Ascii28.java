package com.me;

import java.util.Scanner;
//28)Ascii
public class Ascii28 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);//we created abc scanner object
        char cr=abc.next().charAt(0);//it is used to take input from user from character
        int a=cr;//so we need it from integer so we create a integer so we assign cr
        System.out.println(a);
    }
}

package com.me;

import java.util.Scanner;

public class LeapYear27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int leap = scan.nextInt();
        if (leap % 4 == 0) {
            System.out.println("its a leap year");
        }else{
            System.out.println("not a leap year");
        }

    }
}

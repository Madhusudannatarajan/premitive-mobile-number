package com.me;

import java.util.Scanner;

public class Naturalsnumbers {
    public static void main(String[] args) {
                                             //n*n+1/2
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value");
        int n=scan.nextInt();
        int sum=n*(n+1)/2;
        System.out.println(sum);

    }
}

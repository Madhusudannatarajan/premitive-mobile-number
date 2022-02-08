package com.me;

import java.util.Scanner;

public class Quotientreminder29 {
    public static void main(String[] args) {
        System.out.println("Enter the num1 and num2");
        Scanner scan=new Scanner(System.in);
        int num1= scan.nextInt();
        int num2= scan.nextInt();
        int quotient=num1/num2;
        int reminder=num1%num2;
        System.out.println("when quoitient is" + num1 +"/"+num2+"is" + quotient);
        System.out.println("when reminder is" + num1 +"/"+num2+"is" + reminder);

    }
}

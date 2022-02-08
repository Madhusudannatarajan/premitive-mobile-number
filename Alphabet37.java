package com.me;

import java.util.Scanner;

public class Alphabet37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char alp = scan.next().charAt(0);
        if (alp >= 'A' && alp <= 'Z' ||alp>='a' && alp<='z') {
            System.out.println("its alphabet");
        }
    else{
            System.out.println("its not a alphabet");
        }


    }
}

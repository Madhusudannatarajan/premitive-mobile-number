package com.me;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {

        char vowels ='a';
        switch(vowels){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("its a vowel");
                break;
            default:
                System.out.println("its not a vowel");
                break;


        }
    }
}

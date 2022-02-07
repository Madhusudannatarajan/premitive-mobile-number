package com.me;

public class Ternaryprgm {
    public static void main(String[] args) {
        int a=12, b=10, c=20, result;
        result=((a>b))?
                (a>c)
                ?a
                :c
                :(b<c)
                ? b
                : c;
        System.out.println(" what is greater in three " + result);
    }
}

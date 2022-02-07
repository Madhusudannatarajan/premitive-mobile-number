package com.me;

import java.util.Scanner;

//12)Write a program to find the area of the square
public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);   //int sqr=6
        System.out.print("enter the length");    //sqr=sqr*sqr;
        int length = input.nextInt();            //System.out.print(sqr);
        System.out.println("enter the width");   //o/p=36//
        int width = input.nextInt();
        int rectangle = length * width;
        System.out.println(rectangle);


        //13) Write a program to find the area of the
        // int rad=32;
        // int height=12;
        // double pi=3.14;
        // double ac = pi*(rad*rad);
        // System.out.println(" area of circle is " + ac);
        System.out.println("area of radius");
        int radius=input.nextInt();
        float pi=3.14f;
        System.out.println("enter the height");
        int height=input.nextInt();
        int circlex = (int) ((2 * pi) * (radius * height));
        int circley = (int) ((2 * pi) * (radius * radius));
        System.out.println("area of circle"+(circlex+circley));

//14)area of rectangle
        System.out.print("enter the length");
        int l = input.nextInt();
        System.out.print("enter the breath");
        int b= input.nextInt();
        System.out.println("Area of rectangle="+l*b);


//16) Given the radius of two concentric circle, find the area of the space between the
//circles.
        System.out.println("enter the value");
        int x=input.nextInt();
        System.out.println("enter second value");
        int y= input.nextInt();

        float arr1=pi*x*x;
        float arr2=pi*y*y;
        System.out.println("output is"+(arr2-arr1));


//18)
        int ter=x, y1;
        x = 20;
        y1 = (x == 1) ? 61: 90;
        System.out.println("Value of y is: " +  y);
        y = (x == 20) ? 61: 90;
        System.out.println("Value of y is: " + y);




    }
}

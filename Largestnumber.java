package com.me;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {
        int a,b,c,largestnumber;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first num =");
        a=scan.nextInt();
        System.out.println("Enter the second num =");
        b=scan.nextInt();
        System.out.println("Enter the third num =");
        c= scan.nextInt();
        largestnumber= c>(a>b?a:b)?c:((a>b)?a:b);
        System.out.println(largestnumber);

    }
}

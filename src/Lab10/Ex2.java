package Lab10;

import java.awt.*;
import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        //max
        int max = Max(10,20);
        System.out.println(" ค่ามากที่สุดคือ : "+max);
        //min
        System.out.println(" ค่าน้อยที่สุุดคือ :"+Min(10,20));
        //Multiple
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter an integer1: ");
        int num1 = SC.nextInt();
        System.out.println("Enter an integer2: ");
        int num2 = SC.nextInt();

        int mul = Multiple(num1,num2);
        System.out.println("The multiple value is :" +mul);
    }//main

    private static int Multiple(int num1, int num2) {
        return  num1*num2;

    }//Multiple

    private static int Max(int X, int Y) {
        int RS;
        if (X >Y)
            RS = X;
        else
            RS = Y;
        return RS;
    }//Max

    private static int Min(int X, int Y) {
        int RS;
        if (X < Y)
            RS = X;
        else
            RS = Y;
        return RS;
    }//Min


}//class

package Lab10;

import java.util.Scanner;

public class Ex3 {
    public static final int MAX = 5;

    public static void main(String[] args) {

        //input data to array
        Scanner SC = new Scanner(System.in);
        int num[] = new int[MAX];

        for (int i = 0; i < num.length; i++) {
            System.out.println("enter an integer");
            num[i] = SC.nextInt();

        }
          //find total value in array
          findAverage(num);






    }//main

    private static void findAverage(int[] num) {
        int total = 0;
        for (int val:num) {
            total += val;

        }
          System.out.println("Total value: " + total);
          System.out.println("Average value: " + (total/num.length));

        }

}//class

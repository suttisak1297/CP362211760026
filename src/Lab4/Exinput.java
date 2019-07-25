package Lab4;

import java.util.Scanner;

public class Exinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please,enter an integer:");
        int x = scanner.nextInt();

        System.out.println("Your entered integer: "+x);

    //input double

        System.out.println("Please, enter double: ");
        double y = scanner.nextDouble();

        System.out.println("Your entered integer "+y );


    //input string
        System.out.println("Please,enter you name");
        String s = scanner.nextLine();

        System.out.println("You name is:"+s);
    }

}

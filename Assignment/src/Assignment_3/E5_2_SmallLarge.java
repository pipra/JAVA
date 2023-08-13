package Assignment_3;

import java.util.Scanner;

public class E5_2_SmallLarge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float number ;
        System.out.print("Enter a number: ");
        number = in.nextFloat();
        System.out.print("This Number is: ");
        if( number==0 )
            System.out.print("ZERO");
        else if(number<0)
            System.out.print("NEGATIVE");
        else
            System.out.print("POSITIVE");
        number = - number ;
        System.out.print(" and Absolute value is: ");
        if( number<1 )
            System.out.println("Small");
        else if( number>1000000 )
            System.out.println("Large");
        else
            System.out.println("Middle");
    }
}

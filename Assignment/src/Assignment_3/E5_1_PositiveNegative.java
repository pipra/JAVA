package Assignment_3;

import java.util.Scanner;

public class E5_1_PositiveNegative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double number ;
        System.out.print("Enter a number: ");
        number = in.nextDouble();
        System.out.print("This Number is: ");
        if( number==0 )
            System.out.println("ZERO");
        else if(number<0)
            System.out.println("NEGATIVE");
        else
            System.out.println("POSITIVE");
    }
}

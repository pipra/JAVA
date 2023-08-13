package Assignment_3;

import java.util.Scanner;

public class E5_17_LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        float number1 = in.nextFloat() , number2 = in.nextFloat() , number3 = in.nextFloat() ;
        System.out.print("The Largest Number: ");

        if( number2>number1 && number2>number3 )
            System.out.println(number2);
        else if( number1>number2 && number1>number3 )
            System.out.println(number1);
        else
            System.out.println(number3);
    }
}

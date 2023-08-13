package Assignment_3;

import java.util.Scanner;

public class E5_9_InOrderOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int number1 = in.nextInt() , number2 = in.nextInt() , number3 = in.nextInt() ;
        //Increasing Order
        if( number1<number2 && number2<number3 )
            System.out.println("In Order");
        else if( number1<number2 && number2==number3 )
            System.out.println("In Order");
        else if( number1==number2 && number2<number3 )
            System.out.println("In Order");
        //Decreasing Order
        else if( number1>number2 && number2>number3 )
            System.out.println("In Order");
        else if( number1>number2 && number2==number3 )
            System.out.println("In Order");
        else if( number1==number2 && number2>number3 )
            System.out.println("In Order");
        else
            System.out.println("Not In Order");
    }
}

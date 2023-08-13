package Assignment_3;

import java.util.Scanner;

public class E5_8_IncreasingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int number1 = in.nextInt() , number2 = in.nextInt() , number3 = in.nextInt() ;
        if( number1<number2 && number2<number3 )
            System.out.println("Strict");
        else if( number1>number2 && number2>number3 )
            System.out.println("Lenient");
        else if( number1==number2 && number2==number3 )
            System.out.println("Both Increasing and Decreasing");
        else if( number1<number2 && number2==number3  )
            System.out.println("Increasing");
        else
            System.out.println("Neither");
    }
}

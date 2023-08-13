package Assignment_3;

import java.util.Scanner;

public class E5_10_TwoPair {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter four numbers: ");
        int number1 = in.nextInt() , number2 = in.nextInt() , number3 = in.nextInt() , number4 = in.nextInt();
        if( number1==number2 && number3==number4 )
            System.out.println("Two Pair");
        else if( number1==number4 && number2==number3 )
            System.out.println("Two Pair");
        else if( number1==number3 && number2==number4 )
            System.out.println("Two Pair");
        else
            System.out.println("Not Two Pair");
    }
}

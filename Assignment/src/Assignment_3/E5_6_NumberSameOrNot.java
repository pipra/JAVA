package Assignment_3;

import java.util.Scanner;

public class E5_6_NumberSameOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int number1 = in.nextInt() , number2 = in.nextInt() , number3 = in.nextInt() ;
        if( number1==number2 && number2==number3 )
            System.out.println("All are Same");
        else if( number1!=number2 && number2!=number3 )
            System.out.println("All Different");
        else
            System.out.println("Neither");
    }
}

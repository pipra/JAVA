package Assignment_3;

import java.util.Scanner;

public class E5_3_DigitCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number ;
        System.out.print("Enter a number: ");
        number = in.nextInt();
        if(number<0)
            number = - number ;
        int digit = 0 ;

        if( number<10 ) {
            digit = 1;
        }
        else if(  number<100 ) {
            digit = 2;
        }
        else if( number<1000 ) {
            digit = 3;
        }
        else if(  number<10000 )
            digit = 4 ;
        else if( number<100000 )
            digit = 5 ;
        else if( number<1000000 )
            digit = 6 ;
        else if(  number<10000000 )
            digit = 7 ;
        else if(  number<100000000 )
            digit = 8 ;
        else if(  number<1000000000 )
            digit = 9 ;
        if(digit<10)
            System.out.println("The total digit is: " + digit );
        else
            System.out.println("The Digit is Infinity");
    }
}

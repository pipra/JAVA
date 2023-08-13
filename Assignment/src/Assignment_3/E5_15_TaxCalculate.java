package Assignment_3;

import java.util.Scanner;

public class E5_15_TaxCalculate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Constant constant = new Constant() ;
        System.out.print("Enter your Income: ");
        double income = in.nextDouble() ;
        double tax = 0;
        if( income <= 50000 )
            tax += income * constant.PERCENT_1 ;
        if( income>50000 && income<75000 )
            tax += income * constant.PERCENT_2 ;
        if( income>75000 && income<100000 )
            tax += income * constant.PERCENT_3 ;
        if( income>100000 && income<250000 )
            tax += income * constant.PERCENT_4 ;
        if( income>250000 && income<500000 )
            tax += income * constant.PERCENT_5 ;
        if( income>=50000 )
            tax += income * constant.PERCENT_6 ;

        System.out.println( "Income Tax : " + tax );
    }
}

package Assignment_3;

import java.util.Scanner;

public class E5_4_CompareFirstAndLast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = in.next();
        char first , last ;
        first = string.charAt(0);
        last = string.charAt(string.length()-1) ;
        if( first == last )
            System.out.println("The First and Last Character of this String is Same");
        else
            System.out.println("The First and Last Character of this String is Different");
    }
}

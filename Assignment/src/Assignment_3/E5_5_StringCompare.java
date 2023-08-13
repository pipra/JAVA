package Assignment_3;

import java.util.Scanner;

public class E5_5_StringCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = in.next();
        String first , last ;
        if( string.length()%2==0 ){
            first = string.substring(0,string.length()/2);
            last = string.substring(string.length()/2,string.length());
        }
        else{
            first = string.substring(0,string.length()/2);
            last = string.substring(string.length()/2+1,string.length());
        }
//        System.out.println(first + " " + last);
        if( first.equals(last) ){
            System.out.println("The First and Last Sub String are Same");
        }
        else
            System.out.println("The First and Last Sub String are Differrent");
    }
}

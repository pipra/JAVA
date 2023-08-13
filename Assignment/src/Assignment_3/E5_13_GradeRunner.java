package Assignment_3;

import java.util.Scanner;

public class E5_13_GradeRunner {
    public static void main(String[] args) {
        System.out.print("Enter a Grade: ");
        Scanner in = new Scanner(System.in) ;
        String grades = in.next();
        E5_13_Grade grade = new E5_13_Grade(grades);
        double numValue = grade.getNumericGrade();
        System.out.println(numValue);
    }
}

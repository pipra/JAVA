package Assignment_3;

import java.util.Scanner;

public class E5_14_LetterGradeRunner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double grades ;
        System.out.print("Enter a Grade value: ");
        grades = in.nextDouble();
        E5_14_LetterGrade grade = new E5_14_LetterGrade( grades );
        String result = grade.getLetterGrade();
        System.out.println( result );
    }
}

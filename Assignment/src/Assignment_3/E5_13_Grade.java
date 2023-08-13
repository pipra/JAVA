package Assignment_3;

public class E5_13_Grade {
    private String grade;
    private double numVal;
    public E5_13_Grade(String grade ){
        this.grade = grade ;
    }
    public double getNumericGrade(){
        if (grade.equals("A") || grade.equals("A+") )
            numVal = 4.0;
        else if( grade.equals("A-") )
            numVal = 3.7;
        else if (grade.equals("B+"))
            numVal = 3.3;
        else if (grade.equals("B"))
            numVal = 3.0;
        else if (grade.equals("B-"))
            numVal = 2.7;
        else if (grade.equals("C+"))
            numVal = 2.3;
        else if (grade.equals("C"))
            numVal = 2.0;
        else if (grade.equals("C-"))
            numVal = 1.7;
        else if (grade.equals("D+"))
            numVal = 1.3;
        else if (grade.equals("D"))
            numVal = 1.0;
        else if (grade.equals("D-"))
            numVal = 0.7;
        else
            numVal = 0;

        return numVal;
    }
}

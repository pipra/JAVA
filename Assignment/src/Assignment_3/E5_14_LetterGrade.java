package Assignment_3;

public class E5_14_LetterGrade {
    private double grade ;
    private String letterGrade ;
    public E5_14_LetterGrade( double grade ){
        this.grade = grade ;
    }
    public String getLetterGrade(){
        if ( grade==4.00 )
            letterGrade = "A+" ;
        else if( grade>=3.30 && grade<4.00 )
            letterGrade = "B+";
        else if( grade>=3.00 && grade<3.30 )
            letterGrade = "B";
        else if( grade>=2.70 && grade<3.00 )
            letterGrade = "B-";
        else if( grade>=2.30 && grade<2.70 )
            letterGrade = "C+";
        else if( grade>=2.00 && grade<2.30 )
            letterGrade = "C";
        else if( grade>=1.70 && grade<2.00 )
            letterGrade = "C-";
        else if( grade>=1.30 && grade<1.70 )
            letterGrade = "D+";
        else if( grade>=1.00 && grade<1.30 )
            letterGrade = "D";
        else if( grade>=0.70 && grade<1.00 )
            letterGrade = "D-";
        else
            letterGrade = "Less than D- Grade";

        return letterGrade ;
    }
}

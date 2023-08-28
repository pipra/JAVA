package LAB_EXAM;
import java.lang.Math ;
public class Numeric {
    private double intPower ;
    private double x ;
    private int n ;
    public Numeric(double x , int n ){
        this.x = x ;
        this.n = n ;
    }
    public double power(){
        return Math.pow(x,(double)(n)) ;
    }
}

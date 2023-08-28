package LAB_EXAM;

public class IntPower {
    public static void main(String[] args) {
        double x = 5 ;
        int n = 5 ;
        Numeric numeric = new Numeric( x , n ) ;
        System.out.print("The Ultimate Power Result: ");
        System.out.println( numeric.power() );
    }
}

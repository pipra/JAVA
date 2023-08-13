package Assignment_2;

public class ReverseTesterRunner {
    public static void main(String[] args) {
        ReverseTester res = new ReverseTester() ;
        StringBuilder result = res.reverse() ;

        String actual_result = result.toString() ;
        System.out.println( actual_result );
    }
}

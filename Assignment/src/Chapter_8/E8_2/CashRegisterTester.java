package Chapter_8.E8_2;

public class CashRegisterTester {
    public static void main(String[] args) {
        final Coin DOLLAR = new Coin("Dollar" , 1.00 );
        final Coin QUARTER = new Coin( "Quarter" , .25  ) ;
        final Coin DIME = new Coin( "Dime" , .10  ) ;
        final Coin PENNY = new Coin( "Penny" , .05  ) ;

        CashRegister register = new CashRegister();

        register.recordPurchase(594);
        register.recordPurchase(50);
        register.recordPurchase(200);

        register.receivePayment(800 , DOLLAR );
        register.receivePayment( 445 , QUARTER );

        System.out.printf( "Total Purchase: $%5.2f\n" , register.getTotalPurchase() );
        System.out.printf( "Total Payment: $%5.2f\n" , register.getTotalPayment() );
        System.out.printf( "Total Change: $%5.2f\n" , register.getTotalChange() );

        System.out.println("__________________________________\n");

        System.out.printf( "Number Of Dollar : %3d\n" , register.giveChange( DOLLAR ) );
        System.out.printf( "Number Of Quarter : %2d\n" , register.giveChange( QUARTER ) );
        System.out.printf( "Number Of Dime : %6d\n" , register.giveChange( DIME ) );
        System.out.printf( "Number Of Penny : %6d\n" , register.giveChange( PENNY ) );

    }
}

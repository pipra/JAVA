package Chapter_8.E8_3;

public class PerfectCashRegister {

    private double payment = 0 ;
    private double purchase = 0 ;
    public double Coin( String coinName ){
        if( coinName.equals("DOLLAR") ){
            return 1.00 ;
        }
        else if( coinName.equals("FIVE_DOLLAR") ){
            return 5.00 ;
        }
        return 0;
    }
    public void receivePayment( String coinName , double coinCount ){
        payment = payment + (coinCount * Coin(coinName)) ;
    }
    public double getTotalPayment(){
        return payment  ;
    }
}
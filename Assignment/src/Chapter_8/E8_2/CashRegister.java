package Chapter_8.E8_2;

public class CashRegister {
    private double purchase ;
    private double payment ;
    public CashRegister(){
        payment = 0 ;
        purchase = 0 ;
    }
    public void recordPurchase( double amount ){
        purchase = purchase + amount ;
    }
    public void receivePayment( double coinCount , Coin coinType ){
        payment = payment + coinCount * coinType.getCoinValue() ;
    }
    public double getTotalPurchase(){
        return purchase ;
    }
    public double getTotalPayment(){
        return payment ;
    }
    public double getTotalChange(){
        return (payment - purchase) ;
    }
    public int giveChange( Coin coinType ){
        double coinValue = coinType.getCoinValue();
        double change = payment - purchase ;
        int numberOfCoins = (int) ( change / coinValue ) ;
        return numberOfCoins ;
    }
}

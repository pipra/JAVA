package Chapter_8.E8_2;

public class Coin {
    private String coinName ;
    private double coinValue ;
    Coin( String name , double value ){
        this.coinName = name ;
        this.coinValue = value ;
    }
    public double getCoinValue(){
        return coinValue ;
    }
    public String getCoinName(){
        return coinName ;
    }
}

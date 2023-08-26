package Chapter_8;

public class Coin {
    private String coinName ;
    private double coinValue;
    public Coin( double value,String name ){
        coinName = name ;
        coinValue = value ;
    }
    public double getCoinValue(){
        return coinValue;
    }
    public String getCoinName(){
        return coinName;
    }
    public void setCoinName(String name){
        this.coinName = name ;
    }
    public void setCoinValue(double value){
        this.coinValue = value ;
    }
}

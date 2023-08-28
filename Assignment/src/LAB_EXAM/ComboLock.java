package LAB_EXAM;

public class ComboLock {
    private int secretNumber = 40 ;
    public ComboLock( int secret1 , int secret2 , int secret3 ){

        secretNumber = secretNumber - secret1 ;
        if( secretNumber>40 ){
            secretNumber = secretNumber - 40 ;
        }
        if( secretNumber<0 ){
            secretNumber = -secretNumber;
        }

        secretNumber = secretNumber + secret2 ;
        if( secretNumber>40 ){
            secretNumber = secretNumber - 40 ;
        }
        if( secretNumber<0 ){
            secretNumber = -secretNumber;
        }

        secretNumber = secretNumber - secret3 ;
        if( secretNumber>40 ){
            secretNumber = secretNumber - 40 ;
        }
        if( secretNumber<0 ){
            secretNumber = -secretNumber;
        }
        if( secretNumber==40 ){
            secretNumber = 0 ;
        }
    }

}

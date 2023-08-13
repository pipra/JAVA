package Assignment_2;

public class HollePrinter {
    private String name , name1 ;
    public HollePrinter(){
        name = "Hello, World!";
        name1 = "" ;
    }
    public String original(){
        return name ;
    }
    public String replace( ){
        for( int i=0 ; i < name.length() ; i++ ){
            if( name.charAt(i) == 'e' )
                name1 += 'o' ;
            else if( name.charAt(i) == 'o' )
                name1 += 'e' ;
            else
                name1 += name.charAt(i) ;
        }
        return name1 ;
    }
}

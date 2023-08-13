package Assignment_2;

public class ReplaceTester {
    private String name ;
    public String name1 ,name2 ;
    public ReplaceTester(){
        name = "mississippi" ;
    }
    public String replace(){
        name1 = name.replace( 'i' , '!' ) ;
        name2 = name1.replace( 's' , '$' ) ;
        return name2 ;
    }
}

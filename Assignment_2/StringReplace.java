package Assignment_2;

public class StringReplace {
    private String name;
    public StringReplace(){
        name = "mississippi" ;
    }
    public int replace(){
        String name1 = name.replace( "i" ,"ii");
        name = name1;
        return name1.length() ;
    }
    public int replace1(){
        String name2 = name.replace( "ss" ,"s" );
        return name2.length() ;
    }
}

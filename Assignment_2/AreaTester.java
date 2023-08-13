package Assignment_2;

public class AreaTester {
    private int width , height;
    public AreaTester(){
        width =0;
        height =0;
    }
    public int setWidth( int width ){
        this.width = width ;
        return width;
    }
    public int setHeight( int height ){
        this.height = height ;
        return height ;
    }
    public int getArea(){
        return width * height ;
    }
}

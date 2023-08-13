package Assignment_2;

public class PerimeterTesterRunner {
    public static void main(String[] args) {
        PerimeterTester perimeter = new PerimeterTester() ;
        perimeter.setWidth(5);
        perimeter.setHeight(10);
        int result = perimeter.getPerimetr();
        System.out.println(result);
    }
}

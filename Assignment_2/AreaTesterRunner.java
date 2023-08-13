package Assignment_2;

public class AreaTesterRunner {
    public static void main(String[] args) {
        AreaTester area = new AreaTester();
        area.setWidth(5);
        area.setHeight(10);
        int result = area.getArea();
        System.out.println(result);
    }
}

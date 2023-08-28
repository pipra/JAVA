package LAB_EXAM;

public class RobotRunnner {
    public static void main(String[] args) {
        Robot robot = new Robot(4,5);
        robot.move();
        robot.turnLeft();
        robot.turnLeft();
        robot.move();
        robot.move();
        robot.move();
        robot.turnLeft();
        robot.move();
    }
}

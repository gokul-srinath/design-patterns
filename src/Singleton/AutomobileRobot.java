package Singleton;

public class AutomobileRobot implements Machine{

    private static AutomobileRobot robot;
    private AutomobileRobot() {
    }

    public static Machine getInstance() {
        if(robot == null) {
            robot = new AutomobileRobot();
            return robot;
        }

        return robot;
    }

    public static boolean hasInstance() {
        return robot!=null;
    }

    @Override
    public String create() {
        return "Creating Automobile....";
    }
}

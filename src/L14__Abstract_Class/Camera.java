package L14__Abstract_Class;

public class Camera extends Machine{
    @Override
    public void start() {
        System.out.println("camera started");
    }
    public void stop() {
        System.out.println("camera stopped");
    }
}

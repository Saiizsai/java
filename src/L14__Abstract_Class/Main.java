package L14__Abstract_Class;

public class Main {
    public static void main(String[] args) {

        Machine mac = new Camera();
        Machine mac1 = new Car();

        mac.start();
        mac1.start();

        mac.stop();
        mac1.start();

        mac.showInfo();
        mac1.showInfo();
    }
}

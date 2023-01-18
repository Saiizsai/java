package Interface__6;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        MotorBike motorBike = new MotorBike();

//        Machine mac = car;
//        Machine mac = new car();      (di lo ll yay loh ya)

        test(car);
        test(motorBike);
    }

    public static void test (Machine mac) {
        mac.start();
        mac.stop();
    }
}

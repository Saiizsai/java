package Inheritance__five;

public class Main {
    public static void main(String[] args) {

    //    Machine mac = new Machine();
    //    mac.id = 12;
    //    mac.start();
    //    mac.stop();

        Car car = new Car();

        car.start();
        car.stop();
        car.changeGear();
        car.id = 23;
        System.out.println("car id is " + car.id);
    }
}

package L8__Upcasting_Downcasting;

public class Car extends Machine {

    @Override
    public void start() {
        System.out.println("Car started");
    }
    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
    public void changeGear() {
        System.out.println("Gear changed");
    }
}

package Inheritance__five;

public class Car extends Machine{

    @Override
    //name tu yin override lod
    public void start() {
        System.out.println("Car started");
    }

    public void changeGear () {
        System.out.println("Gear changed");
    }



}

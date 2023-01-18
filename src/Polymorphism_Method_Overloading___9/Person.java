package Polymorphism_Method_Overloading___9;

public class Person {
    public void showInfo() {
        System.out.println("I'm Person");
    }
    public void showInfo(int id) {
        System.out.println("I'm Person with id " + id);
    }
    public void showInfo(String name) {
        System.out.println("I'm " + name);
    }
}

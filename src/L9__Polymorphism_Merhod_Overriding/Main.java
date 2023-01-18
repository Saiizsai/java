package L9__Polymorphism_Merhod_Overriding;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.showInfo();

        Student s = new Student();
//      s.showInfo();

        Person p1 = s; //up casting
        p1.showInfo();

    }
}

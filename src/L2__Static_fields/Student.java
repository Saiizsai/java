package L2__Static_fields;

public class Student {

    static int count ;   //static

    int id ;            //instance
    String name;

    public void introduce() {
        System.out.println("Hello");
        System.out.println("I'm " + name + " with id " + id);
    }
}

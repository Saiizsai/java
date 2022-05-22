package Static_Method__three;

public class Student {
    static int count ;

    int id ;    //fields
    String name;

    public void introduce() {
        System.out.println("Hello");
        System.out.println("I'm " + name + " with id " + id);
    }

    public static void showCount() {

        System.out.println("count " + count);
    }
}

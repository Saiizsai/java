package L3__Static_Method;

/*
Note
Instance Method ka ny Static Method kaw Instance Method kaw call loh ya
Static Method ka ny Static Method a chin" pl call loh ya

Instance ka Object nk sai
new object loh build tai a thit build

Static ka Class nk sai
class 1ku lone mr 1ku pl shi
 */

public class Student {
    static int count ;

    int id ;    //fields
    String name;

    //instance method
    public void introduce() {
        System.out.println("Hello");
        System.out.println("I'm " + name + " with id " + id);
    }

    //static method
    public static void showCount() {

        System.out.println("count " + count);
    }
}

package Static_Method__three;

public class SM {
    public static void main(String[] args) {

        Student.count = 3;
        Student.showCount();

        Student.count = 4;
        Student.showCount();

        //      int num = Integer.parseInt("12"); static method

        //  Scanner scanner = new Scanner(System.in);   instance method

        Student sd1 = new Student();      //object

    }
}

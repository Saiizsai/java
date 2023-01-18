package Anonymous_Class__15;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
//        p1.greet();

        Person p2 = new Student();  //up casting
//        p2.greet();

        Person p3 = new Person() {
            @Override
            public void greet() {
                System.out.println("Hello I'm anonymous class");
            }
        };
        p3.greet();

        Machine mac = new Machine(){
            @Override
            public void start(String text) {
                System.out.println("Start method inside anonymous class");
                System.out.println("Text " + text);
            }
        };
        mac.start("Hi");
    }
}

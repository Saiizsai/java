
    class Parent{
void me () {
    System.out.println("this is parent method");
}
    }

    public class Up extends Parent{
        void me() {
            System.out.println("this is child method");
        }
    public static void main (String[] args) {

        Parent p = new Up();

        p.me();
    }


}

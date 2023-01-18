package Instance_Initializer_Block__17;

public class Main {
    String name;

    public Main() {
        System.out.println("hello , this is " + name);
    }

    {
        name = "instance initializer block";
    }

    public static void main(String[] args) {
       Main m = new Main();    //new Main()  di lo ll yay loh ya
    }
}

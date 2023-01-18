package L17__Instance_Initializer_Block;

public class Main {
    String name;

    public Main() {
        System.out.println("Hello " + name);
    }

    {
        name = ",This is instance initializer block";
    }


    public static void main(String[] args) {
       Main m = new Main();    //new Main()  di lo ll yay loh ya
    }
}

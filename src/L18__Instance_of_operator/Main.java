package L18__Instance_of_operator;

//InstanceOf bal ka sin that lr ll so tar sit

class One{

}
public class Main extends One{
    public static void main(String[] args) {
        Main main = new Main();
        One one = null;
        System.out.println(main instanceof Main);
        System.out.println(one instanceof One);
    }
}

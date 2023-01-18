package L10__Access_Modifiers;

public class Main {
    public static void main(String[] args) {

        Machine mac = new Machine();
        mac.id = 12;
//      mac.name = "car";   //name is private modifier
        mac.color = "red";
        mac.count = 1;

    }
}

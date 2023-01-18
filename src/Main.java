import java.io.FilterOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        One o = new One();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num");
        int i = scanner.nextInt();

        One.amount = i;
        o.r(i);


    }
}





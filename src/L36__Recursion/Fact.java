package L36__Recursion;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();
        int c = 1;
        for (int a = num ; a >= 1 ; a --){
            int b = (num*a);
            b = c;System.out.println(c);
        }


    }
}

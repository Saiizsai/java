package L21__String;

import java.util.Scanner;

public class String_Extra_Method {
    public static void main(String[] args) {
        String message = "  Hello World ";
        System.out.println(message.toUpperCase());
        System.out.println(message.length());

        //endsWith
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email");
        String input = scanner.nextLine();

        if (input.endsWith("@gmail.com")){
            System.out.println("correct email");
        }
        else {
            System.out.println("wrong email try again");
        }

        //startWith
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner1.nextLine();

        if (name.startsWith("Mg")) {
            System.out.println(name + "You are man");
        } else if (name.startsWith("Ma")){
            System.out.println(name + "You are woman");
        }

        String s = "Sai Hlaing Phyo Aung";
        System.out.println(s.charAt(4));
        System.out.println(s.indexOf('A'));
        System.out.println(s.indexOf("a"));

    }
}

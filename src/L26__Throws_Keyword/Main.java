package L26__Throws_Keyword;

import java.util.Arrays;

public class Main {
    public static void met(int number){
        if (number < 5){
            throw new ArithmeticException("ari ex");
        } else {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        try {
            met(4);
        } catch (Exception e){
            System.out.println(e);
        }

        String [] name = {"one ","two"};
        boolean b = Arrays.asList(name).contains("three");
        System.out.println(b);

    }
}

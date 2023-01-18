package Wrapper__19;

//primitive data type =-> object      auto boxing
//object =-> primitive data type      unboxing

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {

        //Integer ko length shr nee
        int i = 12;
        Integer integer = i;
        String str = integer.toString();
        System.out.println(str.length());

        //String to integer
        String s = "12345";
        int o = Integer.parseInt(s);
        System.out.println(o);

        //Int to String
        int u = 123;
        String ss = String.valueOf(u);
        System.out.println(ss);
    }

}

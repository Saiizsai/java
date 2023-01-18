package L37__Array;

import javax.swing.*;
import java.util.Scanner;

public class Array_Main {
    public static void main(String[] args) {

        int arr[];
        int size = 5;
        Array obj = new Array();
        arr= obj.inputNumber(size);
        System.out.println("input process is done");

        obj.Addition(arr);
        obj.MaximumNumber(arr);
        obj.MinimumNumber(arr);

        System.out.println("The first job is done");
    }
}

package L37__Array;

import java.util.Scanner;

public class Array {

    //1. collect array 10 number
    //2. add 10 number
    //3. find max and min

    //1
    int[] inputNumber(int size){
        Scanner scanner = new Scanner(System.in);
        int number [] = new int[size];
        for (int i = 0 ; i < size ; i ++){
            System.out.println("Enter Number");
            number[i] = scanner.nextInt();
        }
        return number;
    }

    //2
    void Addition(int [] arr) {
        int sum = 0 ;
        for (int i = 0 ; i< arr.length; i ++) {
            sum+=arr[i];
        }
        System.out.println("Addition Result = " + sum);
    }

    //3
    void MaximumNumber(int [] arr){
        int max = 0;
        for (int i = 0 ; i<arr.length; i ++){
            if (arr[i] > max)
                //arr[i] <min      for minimum
                max = arr[i];
        }
        System.out.println("Maximum Number = " + max);
    }

    void MinimumNumber (int [] arr){
        int min = arr[0];
        for (int i = 0 ; i<arr.length ;i ++){
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Miminum Number = " + min);
    }

}

package L37__Array;

import java.util.Arrays;

public class JDC_Arrays {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,4,5,6,7};

        //Fill     akone 4loh pyae
        Arrays.fill(a,4);
        System.out.println(Arrays.toString(a));

        //Fill form idex to idex
        Arrays.fill(a,1,3,5);
        System.out.println(Arrays.toString(a));

        //Sort     like ngl sin kyi lite
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        //Binary Search       **Sort lod htr tk kg pl search lod loh ya
        System.out.println(Arrays.binarySearch(a,4));

        //CopyOf
        int [] b = Arrays.copyOf(a,6);
        System.out.println(Arrays.toString(b));

        //CopyOfRange
        int [] c = Arrays.copyOfRange(a,3,12);
        System.out.println(Arrays.toString(c));
    }
}

package L28__Collection_Framework;

import com.sun.jdi.IntegerType;

import java.util.ArrayList;


/*
Type Parameter
1. T Type
2. E Element      E ka akone latt khan (String,int) like ArrayList
3. K Key
4. V Value
5. Number
 */

public class Generic {

    static <E> void acceptArray(E[] str){
        for (E s : str){
            System.out.println(s + "\t");
        }
       // System.out.println(Arrays.toString(str));
    }

    public static void main(String[] args) {
        //         generic
        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("this is generic ex");
        System.out.println(arrayList);


        String []str = {"this", "is", "<E>"};
        acceptArray(str);

    }
}

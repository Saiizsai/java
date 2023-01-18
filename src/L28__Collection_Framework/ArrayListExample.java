package L28__Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        int number[] = new int[3];
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList1 = new ArrayList<>();
        List<String> list = new ArrayList();////

        number[1] = 1;

        arrayList.add("this is array list");
        arrayList.add(1);
        arrayList.add('c');
        System.out.println(arrayList);

        arrayList1.add(String.valueOf(23));
        arrayList1.add("this is array list one");
        System.out.println(arrayList1);

        arrayList1.add(2,"this is add");
        System.out.println(arrayList1);

        arrayList1.clear();
        System.out.println(arrayList1);

        list.add("this is list one");
        list.add("this is list two");
        System.out.println(list);
    }
}

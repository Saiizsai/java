package L37__Array;

public class v {
    public static void main(String[] args) {
        v vv  = new v();
        vv.show("one" , "two");
    }

    void show(String str , String ... values){
        System.out.println("1 " + str);
        for (String s :values){
            System.out.println(s);
        }
    }
}

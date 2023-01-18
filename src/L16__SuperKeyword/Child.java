package L16__SuperKeyword;

public class Child extends Parent{
    static String s = "this is child";
    void show() {
        System.out.println(super.s);
    }

}

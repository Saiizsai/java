package L11__This__Keyword;

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.showName("this is this keyword");

        Student sd = new Student();
        sd.name = "mgmg";
        sd.showName("Ma ma");

        /*
        Student sd1 = new Student();
        sd1.name = "haha";
        sd1.showName("zaw zaw");
         */
    }
}

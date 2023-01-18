package L21__String;

public class String_Constant_Pool {
    public static void main(String[] args) {

        String name = "this is string one";
        String name1 = new String("this is string two");
      char [] ch = {'t','h','i','s',' ','i','s',' ','s','t','r','i','n','g'};
      String string = new String(ch);

        System.out.println(name);
        System.out.println(name1);
        System.out.println(string);

        // \\character por chin yin tone
        System.out.println("this is \\character");

        // \t
        System.out.println("this is \t tab");

        // \r
        System.out.println("this is \rreturn");

        // \n new line
        System.out.println("this is \nnew line");

    }
}

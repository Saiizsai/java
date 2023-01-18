package L19__Wrapper;

//primitive data type =-> object      auto boxing
//object =-> primitive data type      unboxing

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
        System.out.println(ss + 2);

        //Compare
        //nyi yin 0 loh pya
        //first int ka gyi ny yin 1 loh pya
        //second int ka gyi ny yin -1 loh pya

        int a = 10;
        int b = 13;

        int result1 = Integer.compare(a, b);
        System.out.println(result1);

        Integer c = a;
        Integer d = b;
        int result2 = c.compareTo(d);
        System.out.println(result2);

        //Type Change
        Double dd = 18.12;
        byte aa = dd.byteValue();
        short bb = dd.byteValue();
        int  cc = dd.intValue();
        long ee = dd.longValue();
        float ff = dd.floatValue();

    }

}

package L7__Casting_Numerical_Value;

public class Main {
    public static void main(String[] args) {

        //a tay ka ny a gyi ko kaw loh ya
        // a gyi ka ny a tay ko kaw yin casting phan pay ya

        byte b = 23;
        int i = b;
        System.out.println(i);

        //byte shot int long float double boolean char
        //casting
        int u = 129;
        byte y = (byte)u;          //-128, -127 , -126 ,,,0,,, 127
        System.out.println(y);

        float f = 123.4f;
        int o = (int)f;
        System.out.println(o);
    }
}

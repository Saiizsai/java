package Casting_Numerical_Value___7;

public class Main {
    public static void main(String[] args) {

        byte b = 23;
        int i = b;
        System.out.println(i);

//casting
        int u = 129;
        byte y = (byte)u;          //-128, -127 , -126 ,,,0,,, 127
        System.out.println(y);

        float f = 123.4f;
        int o = (int)f;
        System.out.println(o);
    }
}

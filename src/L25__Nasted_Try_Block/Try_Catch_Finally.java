package L25__Nasted_Try_Block;

public class Try_Catch_Finally {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        System.out.println("program start");

        try {
            int c = a /b;
            System.out.println(c);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("this is finally");
        }

        System.out.println("program stop");
    }
}

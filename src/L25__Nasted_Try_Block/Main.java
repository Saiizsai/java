package L25__Nasted_Try_Block;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try{
            try {
                int c = a/b;
                System.out.println(c);
            } catch (ArithmeticException e){
                System.out.println("first expression");
            }

            try {
                int d[] = new int[5];
                System.out.println(d[6]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("second expression");
            }

            try {
                String name = null;
                System.out.println(name.length());
            } catch (NullPointerException e){
                System.out.println("third expression");
            }

        } catch (Exception e){
            System.out.println("final expression");
        }
        System.out.println("end of this program");

        /*di lo pone san ll shi
        try{
        try{
        try{
        }
        }
        }
         */
    }
}

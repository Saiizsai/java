package L24__Exception_Handling;

public class ExceptionEx {
    public static void main(String[] args) {

        System.out.println("program start");
        int a = 29;
        int b = 0;
        try {
            int result = a / b;
            System.out.println(result);

        } catch (Exception exception){
            System.out.println("your program have exception");
        }
        System.out.println("program stop");


        //exception por yin out ka kg a lod ma lod
        //out ka kg a load lod chin yin "try,catch,finally" nk tone
        //throw ko koh hr ko exception phan tee chin yin tone
        //exception pyit ny tk kg ko try catch ma loh bu so yin out ka program a lod ma lod

    }
}

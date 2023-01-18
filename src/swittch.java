public class swittch {
    public static void main(String[] args) {
        int a = 15;

        //normal switch
        switch (a){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 5:
                System.out.println(5);
        }


        //new switch     ->  pr yin break hte sayr ma lo
        //switch ko assignment a ny nk yay loh ya
        switch (a){
            case 1 -> System.out.println(1);
            case 2 , 3 -> System.out.println(2 +" and " +3);
            case 5 -> System.out.println(5);
            default -> System.out.println(10);
        }

        String name = switch (a){
            case 1 -> "this is one";
            default -> "i dont know";
        };
    }
}

package L23__Exception_Handling;

public class Custom_Exception {
    public static void main(String[] args) {
        int [] num = {1,2,3};

        try{
            System.out.println(num[4]);
        } catch (Exception e){
            System.out.println("you are nob try again");
        }
    }
}

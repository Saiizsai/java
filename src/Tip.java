public class Tip {
    public static void main(String[] args) {

        //break ka loop hte ka out
        int i = 0;
       while (i<=10){
           System.out.println("Value of variable is " + i);
           if (i==5){
               break;
           }
           i++;
       }


       //continue ka loop htk pat
        for (i = 1 ; i <= 100 ; i ++){
            if ((i%2)!=0)
                continue;
            
            System.out.println(i);
        }
    }
}

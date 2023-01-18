package L37__Array;

public class VarArges {
    public static void main(String[] args) {
        VarArges varArges = new VarArges();
        varArges.var("This " , "is " , "VarArges");
    }

    //Vararges (Variable Arguments) Java 5
    //Varage mhr arument 1ku pl yay loh ya
    //Varage ka nout sone mr pl pyit ya ml
    //variable twy a myr g tain chin yin varage ko tone

    void var(String ... values){
        for (String str : values){
            System.out.println(str);
        }
    }

    void hello(int count , String ... names){

    }
}

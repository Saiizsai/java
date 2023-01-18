package L27__Inner_Class;

class A{
    void haveIt(){

    }
}

interface InnerInterface{
    void doIt();
}

interface InnerInterface2{
    void makeIt();
}

public class AnonymousInner_Class_Interface implements InnerInterface {

    @Override
    public void doIt() {
        System.out.println("do it");
    }

    public static void main(String[] args) {
        AnonymousInner_Class_Interface obj = new AnonymousInner_Class_Interface();
        obj.doIt();


        InnerInterface2 objI = new InnerInterface2() {
            @Override
            public void makeIt() {
                System.out.println("body");
            }
        };
        objI.makeIt();

    /* di lo ll yay loh ya
    @Override
       public void makeIt() {
           System.out.println("body");
       }.makeIt():

    */

    }
}
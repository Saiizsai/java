package SuperKeyword__16;

//"Super" parent class ka field ko kaw 3 chin yin super ko south p 3
//note*** method south p mha 3 loh ya

public class Main {
    public static void main(String[] args) {

       Child c = new Child();
        System.out.println(c.s);

        c.show();    //super


        Atm u1 = new Atm("Mg Mg " , 101 , 50000);
        u1.showData();
    }
}

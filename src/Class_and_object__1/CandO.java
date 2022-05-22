package Class_and_object__one;

public class CandO {
    public static void main(String[] args) {

     Student st1 = new Student();
     st1.id = 1;
     st1.name = "Mg mg";
     st1.introduce();

     Student st2 = new Student();
     st2.id = 2;
     st2.name = "Aung Aung";
     st2.introduce();

     System.out.println(st1 == st2);

    }
}

package Constructor__4;

public class Student {
    int id ;
    String name;

    //constructor
    //return type ma pr
    //class name nk tu ya ml
    //con 2ku sout chin yin argument ma tu mha ya


    Student() {
        System.out.println("No Argument Constructor");
    }

    //constructor overloading
    //name tu yin override lod
    Student(int id) {
        System.out.println("Constructor with Integer ");
    }

    Student(String name) {
        System.out.println("Constructor with Name");
    }


}

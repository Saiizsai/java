package Static_fields__2;

public class SF {
    public static void main(String[] args) {

        Student.count = 3;                 //static
        System.out.println(Student.count);

        Student st1 = new Student();    // instance
  //    System.out.println(st1.count);   //ma yay thint!!!
  //    st1.count = 7;

        Student.count = 80;

        Student st2 = new Student();
  //    st2.count = 8;
        System.out.println("After " + Student.count);
    }
}

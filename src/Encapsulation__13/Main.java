package Encapsulation__13;

public class Main {

    public static void main(String[] args) {
        Student x = getInfo();
        System.out.println("Name : " + x.getName());
        System.out.println("rollNo : " + x.getRollNo());
    }

        public static Student getInfo() {
        int rollNo = 23;
        String name = "Mg Mg";

        //single unite
        Student sd = new Student();
        sd.setName(name);
        sd.setRollNo(rollNo);

        return sd;
    }
}

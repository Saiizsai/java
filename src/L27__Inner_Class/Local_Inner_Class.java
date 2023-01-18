package L27__Inner_Class;

//method hte mr build tk class ko local inner class loh kaw

public class Local_Inner_Class {
    public static void main(String[] args) {
       Mach mach = new Mach();
       mach.start();
    }
}

class Mach{
    public void start(){

        class Robot{
            public void start(){
                System.out.println("this is local inner class");
            }
        }
        Robot robot = new Robot();
        robot.start();
    }
}

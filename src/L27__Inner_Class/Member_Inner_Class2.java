package L27__Inner_Class;

public class Member_Inner_Class2 {
    public static void main(String[] args) {
        Machine m = new Machine();
        //dike yike kaw
        Machine.Camera camera = m.new Camera();
        camera.Take();
        m.start();
    }
}

class Machine{
    public String name = "Car";
    public void start(){
        System.out.println(name + " is start");
        //**
        Camera camera = new Camera();
        camera.Take();
    }

    class Camera{
        public void Take(){
            System.out.println("Taking a photo from camera");
        }
    }
}

package L8__Upcasting_Downcasting;

public class Main {
    public static void main(String[] args) {
        Machine mac = new Machine();
        Car car = new Car();

//        mac.start();
//        mac.stop();

//        car.start();
//        car.stop();
//        car.changeGear();

        //up casting --- parent -> child

        Machine mac1 = (Machine)car;          //car;  di lo yay ll ya
        mac1.start();
        mac1.stop();

        //down casting -> child to parent

//      Car car1 = (Car) mac;    **error
        Car car1 = (Car) mac1;        //Note** Machine mac = new Machine();
        car1.start();                 // mac ko call loh ma ya
        car1.stop();
        car1.changeGear();

    }
}

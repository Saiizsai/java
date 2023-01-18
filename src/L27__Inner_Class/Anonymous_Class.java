package L27__Inner_Class;

class  Papa{
    void showMyName(){
        System.out.println("this is papa class");
    }
}

class  Mama extends Papa{
    @Override
    void showMyName() {
        System.out.println("this is mama class");
    }
}

public class Anonymous_Class {
    public static void main(String[] args) {
        Papa papa = new Papa(){
            void showMyName(){
                System.out.println("this is anonymous papa class");
            }
        };
        papa.showMyName();

    }
}

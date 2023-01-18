package L3__Static_Final;

//final method ko @Override lod loh ma ya
//final class ko extends lod loh ma ya
//constructor ko final lod loh ma ya

public class Main {
    final String name = "Mg Mg";

    public static void main(String[] args) {
        new Main().showName();
    }

    public void showName(){
        System.out.println(name);
    }
}

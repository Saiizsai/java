package L3__Static_Final;

//blank final ko constructor ka pl asign lod loh ya

public class Blank_Final {
    final String name;

    public Blank_Final(){
        name = "this is blank final";
    }

    public static void main(String[] args) {
        System.out.println(new Blank_Final().name);
    }
}

package L19__Custom_Wrapper;

class Custom {
    private int num ;
    Custom (int num ) {
        this.num = num;
    }
}

public class Main {
    public static void main(String[] args) {
        Custom custom = new Custom(12);
        System.out.println(custom);
    }

}

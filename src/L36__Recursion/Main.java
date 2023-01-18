package L36__Recursion;

// method ka koh hr ko a kyine" kaw chin yin recursion ko tone

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.factory(5));
    }

    public int calculate(int num){
        System.out.println(num);
        if (num ==3){
            return 3;
        }
        return calculate(num -1);
    }


    // factory
    public int factory (int fact){
        if (fact == 1){
            return 1;
        }
        return factory(fact-1)*fact;
    }
}

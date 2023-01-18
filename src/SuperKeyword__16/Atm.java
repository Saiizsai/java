package SuperKeyword__16;

public class Atm extends Atm_data {
    double amount;

    public Atm(String name , int id , double amount) {
        super(name , id);
        this.amount = amount;
    }

    void showData() {
        System.out.println("name = " + name + "\nID = " + id + "\nAmount = " + amount);
    }
}

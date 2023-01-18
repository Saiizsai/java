package Enum__20;

//getname nk ll yay loh di tai ll yay loh ya

public class Main {
    public static void main(String[] args) {

        //one
        User user1 = new User("mgmg" , Rank.Emerald);
        User user2 = new User("ayeaye" , Rank.Diamond);
        User user3 = new User("kyaw gyi" , Rank.Grandmaster);

        System.out.println(user2.name + " Rank is " + user1.rank);

        //two
        for (Car data : Car.values()) {
            System.out.println(data + " Prices is " + data.getCost() +" " +  data.getYear() + " Model");
        }
    }
}

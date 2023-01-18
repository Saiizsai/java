package L20__Enum;

public enum Car {
   Lambo(1000 , 2019),
    Farrie(1100 , 2020),
    McLarean(1050 , 2020);

   public int cost ;
   public int year ;

   Car(int price , int model) {
       cost = price;
       year = model;
   }

   public int getCost() {
       return cost;
   }
   public int getYear() {
       return year;
   }
}

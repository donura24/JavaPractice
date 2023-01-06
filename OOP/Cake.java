package JavaPractice.OOP;

public class Cake {
    String dough;
    String sugar;
    String apples;
    String chocolate;
    Cake(String dough, String sugar,String apples, String chocolate){
        this.dough = dough;
        this.sugar = sugar;
        this.apples = apples;
        this.chocolate = chocolate;

    }
    Cake(String dough, String sugar,String apples){
        this.dough = dough;
        this.sugar = sugar;
        this.apples = apples;

    }
    Cake(String dough, String sugar){
        this.dough = dough;
        this.sugar = sugar;

    }
}

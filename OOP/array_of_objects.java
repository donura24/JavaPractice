package JavaPractice.OOP;

public class array_of_objects {
    public static void main(String[] args) {
        //Food[] frige = new Food[3];

        Food food1 = new Food("Milk");
        Food food2 = new Food("Eggs");
        Food food3 = new Food("Pizza");

        Food[] frige = {food1,food2,food3};

        //frige[0] = food1;
        //frige[1] = food2;
        //frige[2] = food3;

        System.out.println(frige[0].name);
        System.out.println(frige[1].name);
        System.out.println(frige[2].name);
    }

}

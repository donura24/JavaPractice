package JavaPractice.Reflection_;

public class Snake {

    private final String name;
    private int age;

    public Snake(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void snakeNoise(){
        System.out.println("S-s-s-s-s....");
    }
    private void thisIsPrivate(){
        System.out.println("Calling this is not allowed!?");
    }
    public static void publicStaticMethod(){
        System.out.println("Method - Public and Static!");
    }
    private static void privateStaticMethod(){
        System.out.println("Method - Private and Static!");
    }
}

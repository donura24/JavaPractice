package JavaPractice.Annotations;
@VeryImportant
public class Frog {

@ImportantString
    String name;
    int age;

    public Frog(String name) {
        this.name = name;
    }
@RunImmediately(times = 3)
    public void frogh() {
        System.out.println("FROGH-FROGH!");
    }

    public void jump() {
        System.out.println("JUMP-JUMP!");
    }

}

package JavaPractice.InnerClasses;

public class Main {
    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        outerClass.hello();

        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.whatsUp();
    }
}

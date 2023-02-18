package JavaPractice.InnerClasses;

public class OuterClass {
    int age;
    String name;

    public void hello(){
        System.out.println("Hello there!");

        class LocalInnerClass {

            String words = "Random words - ......";

            public void printLocalInnerClass(){
                System.out.println(words);
            }
        }
        LocalInnerClass lic = new LocalInnerClass();
        lic.printLocalInnerClass();
    }

    public static class InnerClass {
        int someth;

        public void whatsUp(){
            System.out.println("What's up from the InnerClass?");
        }
    }
}

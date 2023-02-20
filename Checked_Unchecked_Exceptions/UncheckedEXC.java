package JavaPractice.Checked_Unchecked_Exceptions;

public class UncheckedEXC {
    public static void main(String[] args) {

        //String name = "Teodor";
        String name = null;
        printLength(name);
    }
    private static void printLength(String myName){
        try {
            System.out.println(myName.length());
        }
        catch (NullPointerException npe){
            System.out.println("String can't be null!");
        }
    }
}

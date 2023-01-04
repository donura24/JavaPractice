public class SwitchingValues {
    public static void main(Strings[] args) {
        /*
        Switching the values of 'first' and 'second'
         */
        String first = "White";
        String second = "Black";
        String temp;

        temp = first;
        first = second;
        second = temp;

        System.out.println("first: "+ first);
        System.out.println("second: "+ second);
    }
}

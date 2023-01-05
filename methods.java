package JavaPractice;

public class methods {
    public static void main(String[] args) {
/*
        String word = "Hey!";
        int number = 24;
        hello(word,number);

    }
    static void hello(String word, int num){
        System.out.println("Welcome!"+word+num);
    }
 */
        int x = 24;
        int y = 26;

        int z = add(x,y);
        System.out.println(z);

    }
    static int add(int x, int y){
        int z = x +y;
        return z;

    }
}

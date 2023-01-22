package JavaPractice.Generics;

public class Main {
    public static void main(String[] args) {

        MyGenericClass<Integer,Double> one = new MyGenericClass<>(1,3.14);
        MyGenericClass<String,Character> two = new MyGenericClass<>("Teo",'@');
        MyGenericClass<Integer,String> tree = new MyGenericClass<>(66,"Route");


        System.out.println(one.getValue1());
        System.out.println(two.getValue1());
        System.out.println(tree.getValue1());

        System.out.println(one.getValue2());
        System.out.println(two.getValue2());
        System.out.println(tree.getValue2());

    }
}

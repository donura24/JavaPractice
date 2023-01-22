package JavaPractice.Generics;

public class MyGenericClass <Thing , Thing2> {
// public class MyGenericClass <Thing extends Number , Thing2 extends Number> { //--->bounded types,
//                                                                         limits the generic class
//                                                                          to have data of a specific types - Ex. Number.
    Thing x;
    Thing2 y;

    MyGenericClass(Thing x, Thing2 y){
        this.x = x;
        this.y = y;

    }
    public Thing getValue1(){
        return x;
    }
    public Thing2 getValue2(){
        return y;
    }

}

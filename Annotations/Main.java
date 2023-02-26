package JavaPractice.Annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Frog frog = new Frog("Frogy");

        if(frog.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("This object is very important!");
        } else {
            System.out.println("This object is not very important!");
        }

        for (Method method :frog.getClass().getDeclaredMethods()){
            if (method.isAnnotationPresent(RunImmediately.class)){
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                for (int i = 0; i < annotation.times(); i++) {
                    method.invoke(frog);
                }
            }
        }
    }
}

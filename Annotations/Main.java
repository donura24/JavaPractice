package JavaPractice.Annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Frog frog = new Frog("Frogy");

        if (frog.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("This object is very important!");
        } else {
            System.out.println("This object is not very important!");
        }

        for (Method method : frog.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                for (int i = 0; i < annotation.times(); i++) {
                    method.invoke(frog);
                }
            }
        }
        for (Field field : frog.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(ImportantString.class)) {
                Object objectValues = field.get(frog);
                if (objectValues instanceof String stringValue){
                    System.out.println(stringValue.toUpperCase(Locale.ROOT));
                }
            }
        }
    }
}

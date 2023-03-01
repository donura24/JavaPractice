package JavaPractice.Reflection_;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {

        Snake snake1 = new Snake("Snakea",2);
        Field[] snakefields = snake1.getClass().getDeclaredFields();

        for (Field field : snakefields){
            if (field.getName().equals("name")){
                field.setAccessible(true);
                field.set(snake1,"SnakeNewName");
            }
        }
        Method [] snakeMethods = snake1.getClass().getDeclaredMethods();
        for (Method method : snakeMethods){
            if (method.getName().equals("privateStaticMethod")){
                method.setAccessible(true);
                method.invoke(null);
            }
            System.out.println(method.getName());
        }
        System.out.println(snake1.getName());

    }
}

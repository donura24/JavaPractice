package JavaPractice.Optionals;

import java.awt.print.Pageable;

public class Snake {

    private final String name;
    private final int age;

    Snake(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

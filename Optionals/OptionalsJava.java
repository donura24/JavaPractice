package JavaPractice.Optionals;

import java.util.Optional;

public class OptionalsJava {

    public static void main(String[] args) {

        Optional<Snake> optionalSnake = findMySnake("SSfred");
        System.out.println(optionalSnake.map(Snake::getAge).orElse(0));

    }

    private static Optional<Snake> findMySnake(String name) {
        Snake snake = new Snake(name, 5);
        return Optional.ofNullable(snake);
    }
}

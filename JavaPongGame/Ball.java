package JavaPractice.JavaPongGame;

import java.awt.*;
import java.util.Random;

public class Ball extends Rectangle{

    Random random;
    int xVelocity;
    int yVelocity;
    Ball(int x, int y, int width, int height){
        super(x,y,width,height);
        random = new Random();
        int randomXDirection = random.nextInt(2);
        if (randomXDirection==0){
            randomXDirection--;
            setXDirection(randomXDirection);
        }
        random = new Random();
        int randomYDirection = random.nextInt(2);
        if (randomYDirection==0){
            randomYDirection--;
            setYDirection(randomYDirection);
        }

    }

    public void setXDirection(int randomXDirection){

    }
    public void setYDirection(int randomYDirection){

    }
    public void move(){

    }
    public void draw(Graphics g){

    }


}

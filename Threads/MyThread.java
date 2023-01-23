package JavaPractice.Threads;

public class MyThread extends Thread{
    @Override
    public void run(){
        if (this.isDaemon()){
            System.out.println("This is a daemon thread!");
        }
        else {
            System.out.println("This is a user thread!");
        }
    }

}
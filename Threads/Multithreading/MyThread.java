package JavaPractice.Threads.Multithreading;

public class MyThread extends Thread{

    @Override
    public void run(){

        for (int i = 5; i > 0; i--) {
            System.out.println("Thread 1# "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("Thread #1 - exit");

    }
}

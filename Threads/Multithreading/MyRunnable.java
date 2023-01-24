package JavaPractice.Threads.Multithreading;

public class MyRunnable implements Runnable{

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 2# "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("Thread #2 - exit");
    }
}

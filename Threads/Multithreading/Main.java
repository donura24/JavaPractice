package JavaPractice.Threads.Multithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        MyThread thread1 = new MyThread();

        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);

        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
        //thread1.join(4000); // calling thread (ex.main) waits until the specified time
        thread2.start();
    }
}

package JavaPractice.Threads;

public class Main {
    public static void main(String[] args) {


        //System.out.println(Thread.activeCount());
        //Thread.currentThread().setName("!MAIN!");
        //System.out.println(Thread.currentThread().getName());

        //Thread.currentThread().setPriority(10);
        //System.out.println(Thread.currentThread().getPriority());

        //System.out.println(Thread.currentThread().isAlive());

        /*
        for (int i = 5; i >0 ; i--) {

            System.out.println(i);
            try {
                Thread.sleep(1000); // delay for 1000ms for each iteration
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Done!!!");
        */

        MyThread thread2 = new  MyThread();
        thread2.setDaemon(false);
        System.out.println(thread2.isDaemon());
        thread2.start();
        //thread2.setName("2nd thread");
        //thread2.setPriority(4);
        //System.out.println(thread2.getPriority());
        //System.out.println(thread2.isAlive());
        //System.out.println("Name of thread: "+thread2.getName());

        //System.out.println(Thread.currentThread().getName());
    }

}

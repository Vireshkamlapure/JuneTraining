package threads;

public class ThreadB implements Runnable {
    @Override
    public void run(){
        long id = Thread.currentThread().getId();
        System.out.println("Starting Thread , Instant  : " + id);
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread-" + id + " Iteration = " + i);
        }
        System.out.println("Stopping Thread , Instant : "+id);
    }
}

package multithreading;

public class ThreadRunnableMainClass {
    
    public static void main(String[] args) {
        
    	ThreadUsingRunnable runnable1 = new ThreadUsingRunnable("Thread 1");
    	ThreadUsingRunnable runnable2 = new ThreadUsingRunnable("Thread 2");
        
        // Create Thread objects with MyRunnable instances
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        
        
        thread1.start();
        thread2.start();
        
        
        System.out.println("Main thread continues while threads are running.");
    }
}

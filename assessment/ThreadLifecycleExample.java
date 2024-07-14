package assessment;

public class ThreadLifecycleExample {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("Thread is in New state.");
            
            // Simulating some work
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            System.out.println("Thread is now Runnable and executing.");
        });

        System.out.println("Thread is created but not yet started.");
        
        // Starting the thread
        thread.start();
        
        System.out.println("Thread is now started and in Runnable state.");

        // Adding delay to observe states
        Thread.sleep(2000);

        // Checking if thread is alive
        if (thread.isAlive()) {
            System.out.println("Thread is still executing.");
        } else {
            System.out.println("Thread execution is completed.");
        }
    }
}


package multithreading;

class MyThread extends Thread {
    
    private int threadId;
    
    public MyThread(int id) {
        this.threadId = id;
    }
    
    @Override
    public void run() {
        System.out.println("Thread " + threadId + " started.");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + threadId + ": " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread " + threadId + " finished.");
    }
}

public class MultithreadingExample {
    
    public static void main(String[] args) {
        // Create threads using the Thread class
        MyThread thread1 = new MyThread(1);
        MyThread thread2 = new MyThread(2);
        
        // Create threads using the Runnable interface
        Runnable myRunnable3 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 3 started.");
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread 3: " + i);
                    try {
                        Thread.sleep(1000); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Thread 3 finished.");
            }
        };
        
        Thread thread3 = new Thread(myRunnable3);
        
        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();
        
        // Main thread continues while threads are executing concurrently
        System.out.println("Main thread continues while threads are running.");
    }
}


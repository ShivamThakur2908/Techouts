package multithreading;

class ThreadUsingRunnable implements Runnable {
    
    private String threadName;
    
    public ThreadUsingRunnable(String name) {
        this.threadName = name;
    }
    
    @Override
    public void run() {
        System.out.println("Thread " + threadName + " is running.");
        try {
            // Simulate some task
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + threadName + " has finished.");
    }
}


package assessment;

public class ThreadProperties {
    public static void main(String[] args) {
        // Create and start 3 threads
        Thread thread1 = new Thread(() -> {
            // Thread task
            try {
                Thread.sleep(3000); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            // Thread task
            try {
                Thread.sleep(3000); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread3 = new Thread(() -> {
            // Thread task
            try {
                Thread.sleep(3000); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Rename thread1 to "yourName" and make it a daemon thread
        thread1.setName("yourName");
        thread1.setDaemon(true);

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Display details of all running threads
        displayThreadDetails();
    }

    private static void displayThreadDetails() {
        // Get all running threads
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        Thread[] threads = new Thread[threadGroup.activeCount()];
        threadGroup.enumerate(threads);

        System.out.println("Thread Details:");
        for (Thread thread : threads) {
            if (thread != null) {
                System.out.println("Name: " + thread.getName());
                System.out.println("ID: " + thread.getId());
                System.out.println("Priority: " + thread.getPriority());
                System.out.println("State: " + thread.getState());
                System.out.println("Daemon: " + thread.isDaemon());
                System.out.println("--------------------------");
            }
        }
    }
}

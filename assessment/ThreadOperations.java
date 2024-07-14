package assessment;

public class ThreadOperations {

    private static int num1 = 5;
    private static int num2 = 10;
    private static double sum = 0;

    public static void main(String[] args) throws InterruptedException {

        // Object for synchronized access (can be replaced with a separate lock object)
        final Object lock = new Object();

        // Thread for addition
        Thread addThread = new Thread(() -> {
            synchronized (lock) {
                sum = num1 + num2;
                System.out.println("Added " + num1 + " and " + num2 + ". Result: " + sum);
                lock.notify(); // Notify waiting threads (optional, can be in display thread)
            }
        });

        // Thread for average calculation
        Thread avgThread = new Thread(() -> {
            synchronized (lock) {
                while (sum == 0) { // Wait until sum is calculated by addThread
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                double average = sum / 2.0;
                System.out.println("Calculated average: " + average);
            }
        });

        // Thread for displaying results
        Thread displayThread = new Thread(() -> {
            synchronized (lock) {
                while (sum == 0) { // Wait until sum is calculated by addThread
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Addition result: " + sum);
                System.out.println("Average result: " + (sum / 2.0));
            }
        });

        // Start threads
        addThread.start();
        avgThread.start();
        displayThread.start();

        // Wait for all threads to finish (optional, can be removed if non-daemon threads)
        addThread.join();
        avgThread.join();
        displayThread.join();

        System.out.println("All operations completed!");
    }
}

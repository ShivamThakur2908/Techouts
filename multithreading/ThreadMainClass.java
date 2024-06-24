package multithreading;

public class ThreadMainClass {

	public static void main(String[] args) {
		ThreadExample thread1 = new ThreadExample("Thread 1");
		ThreadExample thread2 = new ThreadExample("Thread 2");
		thread1.start();
		thread2.start();
	}

}

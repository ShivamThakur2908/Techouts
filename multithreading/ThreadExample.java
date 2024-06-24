package multithreading;

public class ThreadExample extends Thread {
	private String name;
	public ThreadExample(String name)
	{
		this.name = name;
	}
	public void run()
	{
		System.out.println("Thread "+name+" is runnung");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread "+name+" is finished");
	}

}

package corejavasix;

public class FinallyWithoutException {

	public static void main(String[] args) {
		try {
			System.out.println(25/5);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("This is a finally block");
		}

	}

}

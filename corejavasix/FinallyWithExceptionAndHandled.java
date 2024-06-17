package corejavasix;

public class FinallyWithExceptionAndHandled {

	public static void main(String[] args) {
		try {
			System.out.println(25/0);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("This is a finally block");
		}

	}

}

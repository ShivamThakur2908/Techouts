package corejavasix;

public class FinallyWithExceptionButNotHandled {

	public static void main(String[] args) {
		try {
			System.out.println(25/0);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("This is a finally block");
		}

	}

}

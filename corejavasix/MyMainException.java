package corejavasix;

public class MyMainException {

	public static void main(String[] args) {
		
		try 
		{
			throw new MyException("This is User defined Exception");
		} catch (MyException e) {
			System.out.println("This is catch block of Custom Exception");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}

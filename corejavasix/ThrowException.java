package corejavasix;

public class ThrowException {
	
	public void validateAge(int age)
	{
		if(age > 18)
		{
			System.out.println("You can vote !!!");
		}
		else
		{
			throw new ArithmeticException("You can not vote");
		}
	}
	
	public static void main(String[] args) {
		ThrowException te = new ThrowException();
		te.validateAge(13);

	}

}

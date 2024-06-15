package corejavatwo;

public class ConditionalStamement {

	public static void main(String[] args) {
		int a = 10;
		if(a == 10)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		
		if(a >10)
		{
			System.out.println("Hii");
		}
		else if(a > 5)
		{
			System.out.println("hello");
		}
		else if(a < 10)
		{
			System.out.println("how are you");
		}
		else if(a < 5)
		{
			System.out.println("fine, you");
		}
		else
		{
			System.out.println("Bye");
		}
	}

}

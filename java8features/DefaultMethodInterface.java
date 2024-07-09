package java8features;

public interface DefaultMethodInterface {
	default void add()
	{
		int a=10, b =20;
		String a1 = "Shivam ", b1 = " Thakur";
		char a2 = 'S', b2 = 'K';
		System.out.println((a+b)+" "+ (a1+b1)+" "+(a2+b2));
	}
}

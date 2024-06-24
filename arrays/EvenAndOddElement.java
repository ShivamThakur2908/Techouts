package arrays;

public class EvenAndOddElement {

	public static void main(String[] args) {
		int [] arr = {2,3,4,1,34,45,5,3,42,24,5,56,6,7,5,34,6,67,7,86};
		for(int i = 0; i <=arr.length-1; i++)
		{
			if(arr[i]%2 == 0)
			{
				System.out.println("Even Element: "+arr[i]);
			}
			else
			{
				System.out.println("Odd Element: "+arr[i]);
			}
		}

	}

}

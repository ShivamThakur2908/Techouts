package arrays;

public class UserDefineArray {

	public static void main(String[] args) {
		int [] arr = {2,3,4,1,34,45,5,3,42,24,5,56,6,7,5,34,6,67,7,86};
		
		// printing array element using for loop
		System.out.println("Array Elements: ");
		for(int i = 0; i <arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
		
		// printing Even index element
		System.out.println("Array even index Elements: ");
		for (int i=0; i< arr.length ;i++) {
			if(i%2 == 0)
			{
				System.out.println(arr[i]);
			}
		}
		
		// printing odd index element
		System.out.println("Array even index Elements: ");
		for (int i=0; i< arr.length ;i++) {
			if(i%2 != 0)
			{
				System.out.println(arr[i]);
			}
		}
	}

}

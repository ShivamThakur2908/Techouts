package arrays;

public class SumAndProductOfElements {

	public static void main(String[] args) {
		int [] arr = {2,3,4,1,34,45,5,3,42,24};
		int sum =0;
		long prod = 1;
		for(int i =0; i<=arr.length-1;i++)
		{
			sum += arr[i];
			prod *= arr[i];
		}
		System.out.println("Sum of array element: "+sum);
		System.out.println("Product of array element: "+prod);

	}

}

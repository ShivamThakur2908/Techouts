package arrays;

public class PrimeElement {

	public static void main(String[] args) {
		int [] arr = {2,3,4,1,34,45,5,3,42,24,5,56,6,7,5,34,6,67,7,86};
		System.out.println("Prime Element in the given element is: ");
		for(int i=0; i<=arr.length-1; i++)
		{
			int count =0;
			for(int j=1; j<=arr[i]; j++)
			{
				if(arr[i]%j == 0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				System.out.print(arr[i]+" ");
			}
			
		}
		
	}

}

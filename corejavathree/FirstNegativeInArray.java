package corejavathree;

public class FirstNegativeInArray {

	public static void main(String[] args) {
		int arr[] = {1,4,3,34,-6,34,-9};
		firstNegativenumber(arr);
	}
	
	public static void firstNegativenumber(int []arr)
	{
		for(int i = 0; i<= arr.length-1; i++)
		{
			if(arr[i] < 0)
			{
				System.out.println("First Negative Element is: "+arr[i]);
				break;
			}
		}
	}

}

package arrays;

public class SortingAnArray {

	public static void main(String[] args) {
		int [] arr = {2,3,4,1,34,45,5,3,42,24,5,56,6,7,5,34,6,67,7,86};
		SortingAnArray sA= new SortingAnArray();
		sA.sortArray(arr); 
		sA.printSortedArray(arr);

	}
	public void printSortedArray(int arr[])
	{
		for(int i = 0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public void sortArray(int arr[])
	{
		for(int i=0;i<=arr.length;i++)
		{
			for(int j = i+1; j<=arr.length-1;j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}

package corejavathree;

public class SkppingSpecificIndices {

	public static void main(String[] args) {
		int [] arr = {1,2,43,53,46,467,578,34,35,47,4,2456,464,641,56,5};
		printElenemtOfSkippedIndex(arr);

	}
	public static void printElenemtOfSkippedIndex(int []arr)
	{
		for(int i =0; i<=arr.length-1; i++)
		{
			if(i%3 == 0)
			{
				continue;
			}
			else
			{
				System.out.println(arr[i]);
			}
		}
	}

}

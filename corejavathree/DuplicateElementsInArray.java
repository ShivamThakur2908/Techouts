package corejavathree;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		int [] arr = {4,6,8,6,4,5,58,8};
		printDuplicate(arr);
		
	}
	public static void printDuplicate(int []arr)
	{
		for(int i = 0; i<= arr.length-1; i++)
		{
			for(int j = i+1; j<= arr.length-1; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate Element is: "+arr[i]);
					break;
				}
			}
		}
	}

}

package arrays;

public class DuplicateElement {
	public static void main(String[] args) {
		int [] arr = {2,3,4,1,34,45,5,3,42,24,5,56,6,7,5,34,6,67,7,86};
		DuplicateElement dE = new DuplicateElement();
		if(dE.isDuplicate(arr))
		{
			System.out.println("Duplicate Element Found !!!");
		}
		else
		{
			System.out.println("No Duplicate Element Found !!!");
		}
	}
	public boolean isDuplicate(int arr[])
	{
		boolean isFound = false;
		for(int i = 0; i<=arr.length; i++)
		{
			for(int j= i+1; j<= arr.length-1;j++)
			{
				if(arr[i] == arr[j])
				{
					isFound = true;
					break;
				}
			}
		}
		if(isFound)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

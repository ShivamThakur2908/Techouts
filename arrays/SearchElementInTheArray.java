package arrays;

import java.util.Scanner;

public class SearchElementInTheArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = {2,3,4,1,34,45,5,3,42,24,5,56,6,7,5,34,6,67,7,86};
		System.out.println("Enter the element to search: ");
		int searchElement = sc.nextInt();
		int index = Integer.MIN_VALUE;
		for(int i = 0; i<=arr.length-1; i++)
		{
			if(searchElement == arr[i])
			{
				index = i;
				break;
			}
		}
		if(index != -1 && index != Integer.MIN_VALUE)
		{
			System.out.println("Element found at index "+index);
		}
		else
		{
			System.out.println("Element Not Found");
		}
	}

}

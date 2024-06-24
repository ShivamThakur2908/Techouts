package arrays;


public class ReversingTheArray {

	public static void main(String[] args) {
		int [] arr = {2,3,4,1,34,45,5,3,42,24,5,56,6,7,5,34,6,67,7,86};
		System.out.println("Given Array: ");
		
		for (int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Reverse of the Given Array: ");
		
		for (int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}

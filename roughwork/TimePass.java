package roughwork;

import java.util.Arrays;

public class TimePass {

	public static void main(String[] args) {
		int [] arr = {1,3};
		int arr1 [] = {4,5};
		int c[] = new int[arr.length+arr1.length];
		System.arraycopy(arr, 0, c, 0, arr.length);
		System.arraycopy(arr1, 0, c, arr.length, arr1.length);
		System.out.println(Arrays.toString(c)+" "+c.length);
		int sum = Arrays.stream(c).sum();
		System.out.println(((double)sum/c.length));

	}

}

package corejavathree;
import java.util.Scanner;
public class NumberPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		printingNumberPattern(row);
	}
	public static void printingNumberPattern(int row)
	{
		for(int i=1; i<= row ; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				if(i >= j)
				{
					System.out.print(j);
				}
			}
			if(i == 4)
			{
				break;
			}
			System.out.println();
		}
	}

}

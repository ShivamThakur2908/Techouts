package corejavathree;

import java.util.Scanner;

public class RightAnglePattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		printRightAnglePattern(5);
	}
	
	public static void printRightAnglePattern(int row)
	{
		for(int i = 1; i <= row; i++)
		{
			
			for(int j = 1; j <= i; j++)
			{
				
				if(i>=j)
				{
					System.out.print(" * ");
				}
			}
			System.out.println();
			if(i == 3)
			{
				break;
			}
		}
	}

}

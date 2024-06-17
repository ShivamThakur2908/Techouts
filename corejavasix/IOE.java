package corejavasix;

import java.util.Scanner;

public class IOE { //InputOutputException

	public static void main(String[] args) {
		Scanner sc = new Scanner("Hi Shivam");
		System.out.println(sc.nextLine());
		System.out.println("Execption Present: "+sc.ioException());

	}

}

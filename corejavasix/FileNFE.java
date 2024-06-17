package corejavasix;
import java.io.*;
public class FileNFE {//FileNotFoundException

	public static void main(String[] args) {
		File file = new File("c:\\Shivam.txt");
		try 
		{
			FileReader fr = new FileReader(file);
		}
		catch (Exception e) 
		{
			System.out.println("File Does not exist.");
		}
		

	}

}

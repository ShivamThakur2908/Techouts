package corejavasix;
import java.util.*;
public class NSME {  //NoSuchMethod

	public static void main(String[] args) {
		// Java program to demonstrate NoSuchElementException 

				Set exampleleSet = new HashSet(); 

				Hashtable exampleTable = new Hashtable(); 

				try {
					exampleleSet.iterator().next(); 
					//accessing Set 
					
					exampleTable.elements().nextElement(); 
					//accessing Hashtable 
				} catch (NoSuchElementException e) {
					System.out.println("No Such Method !!!!!");
				}
				
				
	}

}

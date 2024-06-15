package corejavafour;

public class MainClass3 {

	public static void main(String[] args) {
		HybridSubClass2 subClassObj1 = new HybridSubClass2();
		
		subClassObj1.grandFatherProperties();
		subClassObj1.fatherProperties();
		subClassObj1.sonProperties();
		System.out.println();
		HybridSubClass3 subClassObj2 = new HybridSubClass3();
		subClassObj2.grandFatherProperties();
		subClassObj2.fatherProperties();
		subClassObj2.daughterProperties();

	}

}

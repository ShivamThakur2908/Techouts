package corejavafour;

public class MainClass2 {

	public static void main(String[] args) {
		HierarchicalSubClass1 subClassObj1 = new HierarchicalSubClass1();
		subClassObj1.Father();
		subClassObj1.son();
		System.out.println();
		HierarchicalSubClass2 subClassObj2 = new HierarchicalSubClass2();
		subClassObj2.Father();
		subClassObj2.daughter();
	}

}

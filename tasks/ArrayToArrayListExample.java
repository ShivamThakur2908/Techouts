import java.util.*;

public class ArrayToArrayListExample {

    public static void main(String[] args) {
        // Convert array to ArrayList using Arrays.asList() and ArrayList constructor
        String[] array = {"Java", "Python", "C++", "JavaScript"};
        
        // first way
        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList(array));
        System.out.println("ArrayList (Approach 1): " + arrayList1);
        
        // Second way
        ArrayList<String> arrayList2 = new ArrayList<>();
        Collections.addAll(arrayList2, array);
        System.out.println("ArrayList (Approach 2): " + arrayList2);
        
        // Third way
        ArrayList<String> arrayList3 = new ArrayList<>();
        for (String element : array) {
            arrayList3.add(element);
        }
        System.out.println("ArrayList (Approach 3): " + arrayList3);
    }
}

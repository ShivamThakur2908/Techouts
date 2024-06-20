package tasks;
import java.util.*;

public class ArrayListToArrayExample {

    public static void main(String[] args) {
        // Convert ArrayList to array using toArray() method
        
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        
        // First Way
        String[] array1 = arrayList.toArray(new String[arrayList.size()]);
        System.out.println("Array (Approach 1): " + Arrays.toString(array1));
        
        // Second Way
        String[] array2 = new String[arrayList.size()];
        arrayList.toArray(array2);
        System.out.println("Array (Approach 2): " + Arrays.toString(array2));
        
        // Third Way
        String[] array3 = arrayList.stream().toArray(String[]::new);
        System.out.println("Array (Approach 3): " + Arrays.toString(array3));
    }
}

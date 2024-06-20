import java.util.*;

public class ReverseArrayList {

    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Mango");

        // Print ArrayList before reversal
        System.out.println("ArrayList before reversal:");
        System.out.println(arrayList);

        // Reverse the ArrayList using Collections.reverse() method
        Collections.reverse(arrayList);

        // Print ArrayList after reversal
        System.out.println("ArrayList after reversal:");
        System.out.println(arrayList);
    }
}

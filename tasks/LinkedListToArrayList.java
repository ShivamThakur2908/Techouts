package tasks;
import java.util.*;

public class LinkedListToArrayList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");

        // Convert LinkedList to ArrayList
        ArrayList<String> arrayList = new ArrayList<>(linkedList);
        //Using ArrayList constructor
        // arrayList = new ArrayList<>();

        System.out.println("ArrayList after conversion:");
        System.out.println(arrayList);
    }
}

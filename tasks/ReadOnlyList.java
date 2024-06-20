import java.util.*;

public class ReadOnlyList {

    public static void main(String[] args) {
        // Create a read-only List
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        List<String> readOnlyList = Collections.unmodifiableList(list);
        // readOnlyList.add("Grapes"); // this will throw an exception.
        System.out.println("Read-only List: " + readOnlyList);
    }

}

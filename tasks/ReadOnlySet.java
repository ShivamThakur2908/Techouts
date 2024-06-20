package tasks;
import java.util.*;

public class ReadOnlySet {

    public static void main(String[] args) {
        // Create a read-only Set
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        Set<Integer> readOnlySet = Collections.unmodifiableSet(set);
        // readOnlySet.add(40); this will throw an exception
        System.out.println("Read-only Set: " + readOnlySet);
    }
}

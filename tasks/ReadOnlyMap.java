import java.util.*;

public class ReadOnlyMap {

    public static void main(String[] args) {
        // Create a read-only Map
        
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        Map<String, Integer> readOnlyMap = Collections.unmodifiableMap(map);
        // readOnlyMap.put("four", 4); this will throw an exception
        System.out.println("Read-only Map: " + readOnlyMap);
    }

   
}


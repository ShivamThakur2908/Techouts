package tasks;
import java.util.*;

public class CountryCapitalMappingExample {

    public static void main(String[] args) {
        // Create a HashMap to map countries to their capitals
        HashMap<String, String> countryCapitalMap = new HashMap<>();
        
        // country-capital pairs
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("USA", "Washington D.C.");
        countryCapitalMap.put("UK", "London");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("France", "Paris");
        
        //  foreach loop
        System.out.println("Iterating using foreach loop:");
        for (String country : countryCapitalMap.keySet()) {
            String capital = countryCapitalMap.get(country);
            System.out.println("Country: " + country + ", Capital: " + capital);
        }
        System.out.println();
        
        // keySet() and Iterator
        System.out.println("Iterating using keySet() and Iterator:");
        Iterator<String> keyIterator = countryCapitalMap.keySet().iterator();
        while (keyIterator.hasNext()) {
            String country = keyIterator.next();
            String capital = countryCapitalMap.get(country);
            System.out.println("Country: " + country + ", Capital: " + capital);
        }
        System.out.println();
        
        // entrySet() and foreach loop
        System.out.println("Iterating using entrySet() and foreach loop:");
        for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
            String country = entry.getKey();
            String capital = entry.getValue();
            System.out.println("Country: " + country + ", Capital: " + capital);
        }
        System.out.println();
        
        // entrySet() and Iterator
        System.out.println("Iterating using entrySet() and Iterator:");
        Iterator<Map.Entry<String, String>> entryIterator = countryCapitalMap.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, String> entry = entryIterator.next();
            String country = entry.getKey();
            String capital = entry.getValue();
            System.out.println("Country: " + country + ", Capital: " + capital);
        }
    }
}

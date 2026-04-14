import java.util.HashMap;
import java.util.Map;

public class CountryCapitalDemo1 {
    public static void main(String[] args) {
        //create a Hashmap
        Map<String,String>countryCapitalMap=new HashMap<>();

        //add 5 country-capital records using put() method
        countryCapitalMap.put("Oman", "Mascut");
        countryCapitalMap.put("Qatar", "Duhha");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("India", "New Delhi");

        System.out.println("Country Records Display Country : ");
        //display all elements using for-each loop
        for(Map.Entry<String,String> n :countryCapitalMap.entrySet()){
            System.out.println("Country :"+n.getKey()+ " Capital :"+ n.getValue());
        }

        //Use get() to display the capital of one specific country
        System.out.println("Capital of Oman: " + countryCapitalMap.get("Oman"));

        //Use containsKey() to check whether one country name exists
        System.out.println("Does Japan exist? " + countryCapitalMap.containsKey("Japan"));
        System.out.println("Does UK exist? " + countryCapitalMap.containsKey("London"));

        //Update the capital of one country using put() with the same key
        countryCapitalMap.put("Qatar", "Duha");
        System.out.println("Updated Capital for Qatar: " + countryCapitalMap.get("Qatar"));
        System.out.println("Updated HashMap: " + countryCapitalMap);

        //Use remove() to delete one country record
        countryCapitalMap.remove("India");
        System.out.println("HashMap after removing India: " + countryCapitalMap);

        //Use size() to display the total number of records left
        System.out.println("Total countries left: " + countryCapitalMap.size());
    }
}
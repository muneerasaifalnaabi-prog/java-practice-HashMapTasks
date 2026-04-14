import java.util.HashMap;
import java.util.Map;

public class ProductPriceDemo1 {
    public static void main(String[] args) {
        //create a Hashmap
        Map<String,Double>productPriceMap=new HashMap<>();

        //add 5 product records using put() method
        productPriceMap.put("Laptop", 1250.99);
        productPriceMap.put("Mouse", 29.99);
        productPriceMap.put("Keyboard", 89.50);
        productPriceMap.put("Smartphones", 299.99);
        productPriceMap.put("TV", 79.99);

        //Display all elements in the HashMap
        System.out.println("Full Product Price HashMap: " + productPriceMap);

        System.out.println("Product Records Display Product : ");
        //display all elements using for-each loop
        for(Map.Entry<String,Double> n :productPriceMap.entrySet()){
            System.out.println("Product :"+n.getKey()+ " Price :$"+ n.getValue());
        }

        //Use get() to display the price of one specific product
        System.out.println("Price of Laptop: $" + productPriceMap.get("Laptop"));

        //Use containsKey() to check whether one product name exists
        System.out.println("Does Mouse exist? " + productPriceMap.containsKey("Mouse"));
        System.out.println("Does Sony exist? " + productPriceMap.containsKey("Sony"));

        //Update the price of one product using put() with the same key
        productPriceMap.put("Keyboard", 99.99);
        System.out.println("Updated Price for Keyboard: $" + productPriceMap.get("Keyboard"));
        System.out.println("Updated HashMap: " + productPriceMap);

        //Use remove() to delete one product record
        productPriceMap.remove("TV");
        System.out.println("HashMap after removing TV: " + productPriceMap);

        //Use size() to display the total number of product records left
        System.out.println("Total products left: " + productPriceMap.size());
    }
}
import java.util.HashMap;
import java.util.Map;

public class BookAuthorDemo {
    public static void main(String[] args) {
        //create a Hashmap
        Map<String,String>bookAuthorMap=new HashMap<>();

        //add 5 book-author records using put() method
        bookAuthorMap.put("Clean Code", "Robert C. Martin");
        bookAuthorMap.put("Head First Java", "Kathy Sierra");
        bookAuthorMap.put("Effective Java", "Joshua Bloch");
        bookAuthorMap.put("Java The Complete Reference", "Herbert Schildt");
        bookAuthorMap.put("Spring in Action", "Craig Walls");

        System.out.println("Book Records Display Book : ");
        //display all elements using for-each loop
        for(Map.Entry<String,String> n :bookAuthorMap.entrySet()){
            System.out.println("Book :"+n.getKey()+ " Author :"+ n.getValue());
        }

        //Use get() to display the author of one specific book
        System.out.println("Author of Clean Code: " + bookAuthorMap.get("Clean Code"));

        //Use containsKey() to check whether one book title exists
        System.out.println("Does Effective Java exist? " + bookAuthorMap.containsKey("Effective Java"));

        //Update the author of one book using put() with the same key
        bookAuthorMap.put("Head First Java", "Kathy Sierra & Bert Bates");
        System.out.println("Updated Author for Head First Java: " + bookAuthorMap.get("Head First Java"));
        System.out.println("Updated HashMap: " + bookAuthorMap);

        //Use remove() to delete one book record
        bookAuthorMap.remove("Spring in Action");
        System.out.println("HashMap after removing Spring in Action: " + bookAuthorMap);

        //Use size() to display the total number of records left
        System.out.println("Total books left: " + bookAuthorMap.size());
    }
}
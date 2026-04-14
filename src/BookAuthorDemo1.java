import java.util.HashMap;
import java.util.Map;

public class BookAuthorDemo1 {
    public static void main(String[] args) {
        //create a Hashmap
        Map<String,String>bookAuthorMap=new HashMap<>();

        //add 5 book-author records using put() method
        bookAuthorMap.put("The Alchemist", "Paulo Coelho");
        bookAuthorMap.put("Sapiens", "Yuval Noah Harari");
        bookAuthorMap.put("Atomic Habits", "James Clear");
        bookAuthorMap.put("Thinking Fast and Slow", "Daniel Kahneman");
        bookAuthorMap.put("Man's Search for Meaning", "Viktor Frankl");

        //Display all elements in the HashMap
        System.out.println("Full Book Author HashMap: " + bookAuthorMap);

        System.out.println("Book Records Display Book : ");
        //display all elements using for-each loop
        for(Map.Entry<String,String> n :bookAuthorMap.entrySet()){
            System.out.println("Book :"+n.getKey()+ " Author :"+ n.getValue());
        }

        //Use get() to display the author of one specific book
        System.out.println("Author of The Alchemist: " + bookAuthorMap.get("The Alchemist"));

        //Use containsKey() to check whether one book title exists
        System.out.println("Does Atomic Habits exist? " + bookAuthorMap.containsKey("Atomic Habits"));

        //Use containsKey() again to check a book title that does not exist
        System.out.println("Does Rich Dad Poor Dad exist? " + bookAuthorMap.containsKey("Rich Dad Poor Dad"));

        //Update the author of one book using put() with the same key
        bookAuthorMap.put("Sapiens", "Yuval Noah Harari Updated");
        System.out.println("Updated Author for Sapiens: " + bookAuthorMap.get("Sapiens"));
        System.out.println("Updated HashMap: " + bookAuthorMap);

        //Use remove() to delete one book record
        bookAuthorMap.remove("Man's Search for Meaning");
        System.out.println("HashMap after removing Man's Search for Meaning: " + bookAuthorMap);

        //Use size() to display the total number of records left
        System.out.println("Total books left: " + bookAuthorMap.size());
    }
}
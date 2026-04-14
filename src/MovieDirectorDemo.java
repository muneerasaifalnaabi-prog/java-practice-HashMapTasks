import java.util.HashMap;
import java.util.Map;

public class MovieDirectorDemo {
    public static void main(String[] args) {
        //create a Hashmap
        Map<String,String>movieDirectorMap=new HashMap<>();

        //add 5 movie-director records using put() method
        movieDirectorMap.put("Inception", "Christopher Nolan");
        movieDirectorMap.put("The Godfather", "Francis Ford Coppola");
        movieDirectorMap.put("Pulp Fiction", "Quentin Tarantino");
        movieDirectorMap.put("The Matrix", "Wachowski Sisters");
        movieDirectorMap.put("Interstellar", "Christopher Nolan");

        System.out.println("Movie Records Display Movie : ");
        //display all elements using for-each loop
        for(Map.Entry<String,String> n :movieDirectorMap.entrySet()){
            System.out.println("Movie :"+n.getKey()+ " Director :"+ n.getValue());
        }

        //Use get() to display the director of one specific movie
        System.out.println("Director of Inception: " + movieDirectorMap.get("Inception"));

        //Use containsKey() to check whether one movie title exists
        System.out.println("Does Pulp Fiction exist? " + movieDirectorMap.containsKey("Pulp Fiction"));

        //Use containsKey() again to check a movie title that does not exist
        System.out.println("Does Avatar exist? " + movieDirectorMap.containsKey("Avatar"));

        //Update the director of one movie using put() with the same key
        movieDirectorMap.put("The Matrix", "The Wachowskis");
        System.out.println("Updated Director for The Matrix: " + movieDirectorMap.get("The Matrix"));
        System.out.println("Updated HashMap: " + movieDirectorMap);

        //Use remove() to delete one movie record
        movieDirectorMap.remove("Interstellar");
        System.out.println("HashMap after removing Interstellar: " + movieDirectorMap);

        //Use size() to display the total number of records left
        System.out.println("Total movies left: " + movieDirectorMap.size());
    }
}
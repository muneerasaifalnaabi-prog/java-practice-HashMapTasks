import java.util.HashMap;
import java.util.Map;

public class CourseTrainerDemo {
    public static void main(String[] args) {
        //create a Hashmap
        Map<String,String>courseTrainerMap=new HashMap<>();

        //add 5 course-trainer records using put() method
        courseTrainerMap.put("Java Programming", "Ahmed Ali");
        courseTrainerMap.put("Web Development", "Sara Hassan");
        courseTrainerMap.put("Database Design", "Mohammed Salem");
        courseTrainerMap.put("Spring Framework", "Fatima Omar");
        courseTrainerMap.put("Python Basics", "Huda Khalid");

        System.out.println("Course Records Display Course : ");
        //display all elements using for-each loop
        for(Map.Entry<String,String> n :courseTrainerMap.entrySet()){
            System.out.println("Course :"+n.getKey()+ " Trainer :"+ n.getValue());
        }

        //Use get() to display the trainer of one specific course
        System.out.println("Trainer of Java Programming: " + courseTrainerMap.get("Java Programming"));

        //Use containsKey() to check whether one course name exists
        System.out.println("Does Web Development exist? " + courseTrainerMap.containsKey("Web Development"));

        //Use containsKey() again to check a course name that does not exist
        System.out.println("Does Android Development exist? " + courseTrainerMap.containsKey("Android Development"));

        //Update the trainer of one course using put() with the same key
        courseTrainerMap.put("Database Design", "Mohammed Salem Updated");
        System.out.println("Updated Trainer for Database Design: " + courseTrainerMap.get("Database Design"));
        System.out.println("Updated HashMap: " + courseTrainerMap);

        //Use remove() to delete one course record
        courseTrainerMap.remove("Python Basics");
        System.out.println("HashMap after removing Python Basics: " + courseTrainerMap);

        //Use size() to display the total number of records left
        System.out.println("Total courses left: " + courseTrainerMap.size());
    }
}
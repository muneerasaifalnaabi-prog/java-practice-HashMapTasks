import java.util.HashMap;
import java.util.Map;

public class StudentMapDemo {
    public static void main(String[] args) {
        //create a Hashmap
        Map<Integer,String>studentMap=new HashMap<>();

        //add 5 student ID and student name records using put() method
        studentMap.put(1001, "Ali Ahmed");
        studentMap.put(1002, "Sara Mohamed");
        studentMap.put(1003, "Omar Hassan");
        studentMap.put(1004, "Layla Ibrahim");
        studentMap.put(1005, "Khalid Nasser");

        System.out.println("Student Records Display ID : ");
        //display all elements using for-each loop
        for(Map.Entry<Integer,String> n :studentMap.entrySet()){
            System.out.println("ID :"+n.getKey()+ " Name :"+ n.getValue());
        }

        //Use get() to display the name of one specific student using the student ID
        System.out.println("Name of Student ID 1002: " + studentMap.get(1002));

        //Use containsKey() to check whether one student ID exists
        System.out.println("Does Student ID 1004 exist? " + studentMap.containsKey(1004));

        //Use containsKey() again to check a student ID that does not exist
        System.out.println("Does Student ID 9999 exist? " + studentMap.containsKey(9999));

        //Update the name of one student using put() with the same key
        studentMap.put(1003, "Omar Hassan Updated");
        System.out.println("Updated Name for ID 1003: " + studentMap.get(1003));
        System.out.println("Updated HashMap: " + studentMap);

        //Use remove() to delete one student record
        studentMap.remove(1005);
        System.out.println("HashMap after removing ID 1005: " + studentMap);

        //Use size() to display the total number of records left
        System.out.println("Total students left: " + studentMap.size());
    }
}
import java.util.HashMap;
import java.util.Map;

public class StudentMarksDemo {
    public static void main(String[] args) {
        //create a Hashmap
        Map<Integer,Integer>studentMarksMap=new HashMap<>();

        //add 5 student records using put() method
        studentMarksMap.put(101, 100);
        studentMarksMap.put(102, 99);
        studentMarksMap.put(103, 78);
        studentMarksMap.put(104, 88);
        studentMarksMap.put(105, 95);

        //Display all elements in the HashMap
        System.out.println("Full Student Marks HashMap: " + studentMarksMap);

        System.out.println("Student Records Display ID : ");
        //display all elements using for-each loop
        for(Map.Entry<Integer,Integer> n :studentMarksMap.entrySet()){
            System.out.println("ID :"+n.getKey()+ " Mark :"+ n.getValue());
        }

        //Use get() to display the mark of one specific student
        System.out.println("Mark of Student ID 103: " + studentMarksMap.get(103));

        //Use containsKey() to check whether one student ID exists
        System.out.println("Does Student ID 102 exist? " + studentMarksMap.containsKey(102));

        //Update the mark of one student using put() with the same key
        studentMarksMap.put(104, 91);
        System.out.println("Updated Mark for ID 104: " + studentMarksMap.get(104));
        System.out.println("Updated HashMap: " + studentMarksMap);

        //Use remove() to delete one student record
        studentMarksMap.remove(105);
        System.out.println("HashMap after removing ID 105: " + studentMarksMap);

        //Use size() to display the total number of student records left
        System.out.println("Total students left: " + studentMarksMap.size());
    }
}
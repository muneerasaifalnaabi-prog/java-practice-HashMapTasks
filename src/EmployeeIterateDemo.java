import java.util.HashMap;
import java.util.Map;

public class EmployeeIterateDemo {
    public static void main(String[] args) {
        //create a Hashmap
        Map<Integer,String>employeeMap=new HashMap<>();

        //add 5 employee records using put() method
        employeeMap.put(101, "Amal");
        employeeMap.put(102, "Sara");
        employeeMap.put(103, "Ahmed");
        employeeMap.put(104, "Huda");
        employeeMap.put(105, "Hassan");

        System.out.println(" Employee ID records :");
        //display full HashMap
        System.out.println(employeeMap);
        System.out.println();

        System.out.println(" display all elements using for-each loop");
        //iterate through HashMap using entrySet()
        for(Map.Entry<Integer,String> entry : employeeMap.entrySet()){
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        System.out.println();

        //add one more employee record
        employeeMap.put(106, "Amani");

        System.out.println("= Updated Full HashMap :");
        //display updated full HashMap
        System.out.println(employeeMap);
        System.out.println();

        System.out.println(" Iterate using entrySet() - Updated Records:");
        //iterate through updated HashMap
        for(Map.Entry<Integer,String> entry : employeeMap.entrySet()){
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}

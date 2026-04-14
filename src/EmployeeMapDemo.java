import java.util.HashMap;
import java.util.Map;

public class EmployeeMapDemo {
    public static void main(String[] args) {
        //create a Hashmap
        Map<Integer,String>employeeMap=new HashMap<>();

        //add 5 employee ID and employee name records using put() method
        employeeMap.put(101, "Amal Ahmed");
        employeeMap.put(102, "Sara Hassan");
        employeeMap.put(103, "Ahmed Salem");
        employeeMap.put(104, "Huda Omar");
        employeeMap.put(105, "Mohammed Khalid");

        System.out.println("Employee Records Display ID : ");
        //display all elements using for-each loop
        for(Map.Entry<Integer,String> n :employeeMap.entrySet()){
            System.out.println("ID :"+n.getKey()+ " Name :"+ n.getValue());
        }

        //Use get() to display the name of one specific employee using the employee ID
        System.out.println("Name of Employee ID 102: " + employeeMap.get(102));

        //Use containsKey() to check whether one employee ID exists
        System.out.println("Does Employee ID 104 exist? " + employeeMap.containsKey(104));

        //Use containsKey() again to check an employee ID that does not exist
        System.out.println("Does Employee ID 999 exist? " + employeeMap.containsKey(999));

        //Update the name of one employee using put() with the same key
        employeeMap.put(103, "Ahmed Salem Updated");
        System.out.println("Updated Name for ID 103: " + employeeMap.get(103));
        System.out.println("Updated HashMap: " + employeeMap);

        //Use remove() to delete one employee record
        employeeMap.remove(105);
        System.out.println("HashMap after removing ID 105: " + employeeMap);

        //Use size() to display the total number of records left
        System.out.println("Total employees left: " + employeeMap.size());
    }
}
import java.util.HashMap;
import java.util.Map;

public class EmployeeKeyLoopDemo {
    public static void main(String[] args) {
        //create a Hashmap
        Map<Integer,String>employeeMap=new HashMap<>();

        //add 5 employee records using put() method
        employeeMap.put(101, "Amal");
        employeeMap.put(102, "Sara");
        employeeMap.put(103, "Ahmed");
        employeeMap.put(104, "Huda");
        employeeMap.put(105, "Hassan");

        //Display all element in  HashMap
        System.out.println("Full HashMap: " + employeeMap);

        System.out.println("Employee Records Display ID : ");
        //Use keySet() to get all employee IDs
        for(Integer key : employeeMap.keySet()){
            System.out.println("ID :"+key+ " Name :"+ employeeMap.get(key));
        }

        //add one more employee record to the map
        employeeMap.put(106, "Amani");

        System.out.println("Updated Records");
        System.out.println("Updated Map: " + employeeMap);

        System.out.println("Employee Records Display ID : ");
        //Repeat the loop to display updated records
        for(Integer key : employeeMap.keySet()){
            System.out.println("ID :"+key+ " Name :"+ employeeMap.get(key));
        }
    }
}
import java.util.HashMap;
import java.util.Map;

public class EmployeeClearDemo {
    public static void main(String[] args) {
        //create a Hashmap
        Map<Integer,String>employeeMap=new HashMap<>();

        //add 5 employee records using put() method
        employeeMap.put(101, "Amal");
        employeeMap.put(102, "Sara");
        employeeMap.put(103, "Ahmed");
        employeeMap.put(104, "Huda");
        employeeMap.put(105, "Hassan");

        System.out.println("Employee Records : ");
        //display all elements using for-each loop
        for(Map.Entry<Integer,String> n :employeeMap.entrySet()){
            System.out.println("ID :"+n.getKey()+ " Name :"+ n.getValue());
        }

        //display size before clearing
        int sizeBeforeClear = employeeMap.size();
        System.out.println("Total employees before clearing: " + sizeBeforeClear);

        //clear all elements using clear() method
        employeeMap.clear();

        System.out.println("  Employee Records After Clearing :");
        //display HashMap after clearing -Empty -
        System.out.println("Employee Map: " + employeeMap);

        //confirm map is empty using size()
        int sizeAfterClear = employeeMap.size();
        System.out.println("Total employees after clearing: " + sizeAfterClear);

        //print confirmation message

        System.out.println("✓ All employee records have been removed successfully!");

    }
}
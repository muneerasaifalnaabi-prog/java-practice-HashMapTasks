import java.util.HashMap;
import java.util.Map;

public class EmployeeUpdateDemo {
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

        //update employee ID 102
        employeeMap.put(102, "Sarah");
        System.out.println(" After First Update ID 102 : ");

        //display updated HashMap
        for(Map.Entry<Integer,String> n :employeeMap.entrySet()){
            System.out.println("ID :"+n.getKey()+ " Name :"+ n.getValue());
        }

        //verify update using get() method
        String updated102 = employeeMap.get(102);
        System.out.println("Updated name for ID 102: " + updated102);

        //update another employee ID 105
        employeeMap.put(105, "Hassan Ali");
        System.out.println(" After Second Update ID 105 : ");
        //display final HashMap
        for(Map.Entry<Integer,String> n :employeeMap.entrySet()){
            System.out.println("ID :"+n.getKey()+ " Name :"+ n.getValue());
        }

    }
}
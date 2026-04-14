import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeKeysValuesDemo {
    public static void main(String[] args) {
        //create a Hashmap
        Map<Integer,String>employeeMap=new HashMap<>();

        //add 5 employee records using put() method
        employeeMap.put(101, "Amal");
        employeeMap.put(102, "Sara");
        employeeMap.put(103, "Ahmed");
        employeeMap.put(104, "Huda");
        employeeMap.put(105, "Hassan");

        System.out.println(" Employee Records : ");
        //display all elements using for-each loop
        for(Map.Entry<Integer,String> n :employeeMap.entrySet()){
            System.out.println("ID :"+n.getKey()+ " Name :"+ n.getValue());
        }

        //display all keys using keySet()
        System.out.println(" All Employee IDs :");
        for(Integer key : employeeMap.keySet()){
            System.out.println("ID: " + key);
        }

        //display all values using values()
        System.out.println(" All Employee Names : ");
        for(String name : employeeMap.values()){
            System.out.println("Name: " + name);
        }

        //add one more employee record
        employeeMap.put(106, "Amani");

        System.out.println("Updated Records");
        System.out.println("Updated Map: " + employeeMap);

        //display updated keys
        System.out.println(" Updated Employee IDs  ");
        for(Integer key : employeeMap.keySet()){
            System.out.println("ID: " + key);
        }


        //display updated values
        System.out.println(" Updated Employee Names : ");
        for(String name : employeeMap.values()){
            System.out.println("Name: " + name);
        }
    }
}
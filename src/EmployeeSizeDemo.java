import java.util.HashMap;
import java.util.Map;

public class EmployeeSizeDemo {
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

        //display total number using size() method
        int totalEmployees = employeeMap.size();
        System.out.println("Total employees: " + totalEmployees);

        //add one more employee record
        employeeMap.put(106, "Amani");

        System.out.println("Updated Employee Records :");

        //display updated HashMap
        for(Map.Entry<Integer,String> n :employeeMap.entrySet()){
            System.out.println("ID :"+n.getKey()+ " Name :"+ n.getValue());
        }

        //display new total using size() method
        int newTotal = employeeMap.size();
        System.out.println("\nTotal employees after adding: " + newTotal);

    }
}
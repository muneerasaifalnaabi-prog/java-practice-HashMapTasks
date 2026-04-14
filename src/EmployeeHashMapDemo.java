import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMapDemo {
    public static void main(String[] args) {
        //create a Hashmap
        Map<Integer,String>employeeMap=new HashMap<>();
        //add element in employeeMap
        employeeMap.put(101, "Amal");
        employeeMap.put(102, "Sara");
        employeeMap.put(103, "Ahmed");
        employeeMap.put(104, "Huda");
        employeeMap.put(105, "Hassan");

        System.out.println("Employee Recordes :");
        //display element using for-each loop
        for(Map.Entry<Integer,String> n :employeeMap.entrySet()){
            System.out.println("ID :"+n.getKey()+ " names :"+ n.getValue());

        }
        //add new employee record

        employeeMap.put(105, "Amani");
        System.out.println("Employee Recordes After adding new Eployee :");

        for(Map.Entry<Integer,String> n :employeeMap.entrySet()){
            System.out.println("ID :"+n.getKey()+ " names :"+ n.getValue());

        }

    }


}

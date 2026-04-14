import java.util.HashMap;
import java.util.Map;

public class EmployeeCompareUpdateDemo {
    public static void main(String[] args) {
        //create a Hashmap
        Map<Integer,String>employeeMap=new HashMap<>();

        //add 5 employee records using put() method
        employeeMap.put(101, "Amal");
        employeeMap.put(102, "Sara");
        employeeMap.put(103, "Ahmed");
        employeeMap.put(104, "Huda");
        employeeMap.put(105, "Hassan");

        System.out.println(" Initial Employee Records :");
        //display all elements using for-each loop
        for(Map.Entry<Integer,String> n :employeeMap.entrySet()){
            System.out.println("ID :"+n.getKey()+ " Name :"+ n.getValue());
        }
        System.out.println();

        //use get() to display current value of ID 102
        System.out.println(" Current value ID 102: " + employeeMap.get(102));

        //update employee name using put() with same key
        employeeMap.put(102, "Sarah");

        //use get() to show new updated value
        System.out.println(" New value ID 102: " + employeeMap.get(102));
        System.out.println();

        //repeat process for ID 105
        System.out.println(" Current value ID 105: " + employeeMap.get(105));

        //update employee name using put() with same key
        employeeMap.put(105, "Hassan Ali");

        //use get() to show new updated value
        System.out.println(" New value ID 105: " + employeeMap.get(105));
        System.out.println();

        System.out.println(" Final HashMap after updates :");
        //display full HashMap after all updates
        for(Map.Entry<Integer,String> n :employeeMap.entrySet()){
            System.out.println("ID :"+n.getKey()+ " Name :"+ n.getValue());
        }
    }
}
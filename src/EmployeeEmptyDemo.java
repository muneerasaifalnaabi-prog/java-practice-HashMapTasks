import java.util.HashMap;
import java.util.Map;

public class EmployeeEmptyDemo {
    public static void main(String[] args) {
        //create a Hashmap
        Map<Integer,String> employeeMap=new HashMap<>();
        //Check if the HashMap is empty before adding any records
        System.out.println("Is Empty ?"+employeeMap.isEmpty());

        //add 5 employee records using put() method
        employeeMap.put(101, "Amal");
        employeeMap.put(102, "Sara");
        employeeMap.put(103, "Ahmed");
        employeeMap.put(104, "Huda");
        employeeMap.put(105, "Hassan");

        System.out.println("Employee Records :");
        //display all elements using for-each loop
        for(Map.Entry<Integer,String> n :employeeMap.entrySet()) {
            System.out.println("ID :" + n.getKey() + " Name :" + n.getValue());
        }
            // Check if the HashMap is empty after adding  records
            System.out.println("Is Empty ?"+employeeMap.isEmpty());

            //Use the clear() method to remove all employee records
            employeeMap.clear();

            System.out.println("Employee Records After clearing :");
            //display all elements using for-each loop
            for(Map.Entry<Integer,String> n :employeeMap.entrySet()){
                System.out.println("ID :"+n.getKey()+ " Name :"+ n.getValue());
                // Check if the HashMap is empty after adding  records
                System.out.println("Is Empty ?"+employeeMap.isEmpty());


        }


    }

    }


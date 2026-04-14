import java.util.HashMap;
import java.util.Map;

public class EmployeeGetDemo {
    public static void main(String[] args) {
        //create a Hashmap
        Map<Integer,String>employeeWithId=new HashMap<>();

        //add 5 employee records using put() method
        employeeWithId.put(101, "Amal");
        employeeWithId.put(102, "Sara");
        employeeWithId.put(103, "Ahmed");
        employeeWithId.put(104, "Huda");
        employeeWithId.put(105, "Hassan");

        System.out.println(" Employee Records :  ");
        //display all elements using for-each loop
        for(Map.Entry<Integer,String> n :employeeWithId.entrySet()){
            System.out.println("ID :"+n.getKey()+ " Name :"+ n.getValue());
        }


        //retrieve employee name using get() method
        String employee102 = employeeWithId.get(101);
        System.out.println("Employee with ID 101: " + employee102);
        System.out.println();

        //retrieve employee name for using get() method
        String employee105 = employeeWithId.get(105);
        System.out.println("Employee with ID 105: " + employee105);
        System.out.println();

        //display result
        System.out.println("Emplyee  record :");
        System.out.println("ID 102 -> " + employee102);
        System.out.println("ID 105 -> " + employee105);
    }
}
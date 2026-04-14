import java.util.HashMap;
import java.util.Map;

public class EmployeeCheckDemo {
    public static void main(String[] args) {


        Map<Integer, String> employeeWithId = new HashMap<>();

        //add 5 employee records using put() method
        employeeWithId.put(101, "Amal");
        employeeWithId.put(102, "Sara");
        employeeWithId.put(103, "Ahmed");
        employeeWithId.put(104, "Huda");
        employeeWithId.put(105, "Hassan");

        System.out.println(" Employee Records :  ");
        //display all elements using for-each loop
        for (Map.Entry<Integer, String> n : employeeWithId.entrySet()) {
            System.out.println("ID :" + n.getKey() + " Name :" + n.getValue());
        }
        //check if key is Exit or not using  containsKey()
        System.out.println("employee ID 105 Exits ? " + employeeWithId.containsKey(105));
        System.out.println("employee ID  106 Exits ? " + employeeWithId.containsKey(106));

        //check if value exit or not using  containsValue()
        System.out.println("Employee name Sara is there ? " + employeeWithId.containsValue("Sara"));
        System.out.println("Employee name Hind is there ? " + employeeWithId.containsValue("Hind"));


    }
}


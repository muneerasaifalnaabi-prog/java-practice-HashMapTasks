import java.util.HashMap;
import java.util.Map;

public class EmployeeRemoveDemo {
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
        //remove one employee using their ID  Using remove()
       String removedEmployee = employeeWithId.remove(104);
        System.out.println("Employee ID 104 named :" + removedEmployee + " removed .");

        System.out.println(" Employee Records After removing Employee ID 104 :  ");
        //display all elements using for-each loop
        for (Map.Entry<Integer, String> n : employeeWithId.entrySet()) {
            System.out.println("ID :" + n.getKey() + " Name :" + n.getValue());
        }
        String removedEmployee105 = employeeWithId.remove(105);
        System.out.println("Employee ID 105 named :" + removedEmployee105 + " removed .");

        System.out.println(" Employee Records After removing Employee ID 104 & 105:  ");
        //display all elements using for-each loop
        for (Map.Entry<Integer, String> n : employeeWithId.entrySet()) {
            System.out.println("ID :" + n.getKey() + " Name :" + n.getValue());
        }
        String removedEmployee106 = employeeWithId.remove(106);
        System.out.println("Employee ID 106 named :" + removedEmployee106 + " removed .");


    }
}




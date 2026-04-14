import java.util.HashMap;
import java.util.Map;

public class DepartmentManagerDemo {
    public static void main(String[] args) {
        //create a Hashmap
        Map<String,String>departmentManagerMap=new HashMap<>();

        //add 5 department-manager records using put() method
        departmentManagerMap.put("HR", "Sarah Ahmed");
        departmentManagerMap.put("IT", "Mohammed Ali");
        departmentManagerMap.put("Finance", "Fatima Salem");
        departmentManagerMap.put("Marketing", "Hassan Omar");
        departmentManagerMap.put("Sales", "Layla Khalid");

        System.out.println("Department Records Display Department : ");
        //display all elements using for-each loop
        for(Map.Entry<String,String> n :departmentManagerMap.entrySet()){
            System.out.println("Department :"+n.getKey()+ " Manager :"+ n.getValue());
        }

        //Use get() to display the manager of one specific department
        System.out.println("Manager of IT: " + departmentManagerMap.get("IT"));

        //Use containsKey() to check whether one department name exists
        System.out.println("Does Finance exist? " + departmentManagerMap.containsKey("Finance"));

        //Use containsKey() again to check a department name that does not exist
        System.out.println("Does Research exist? " + departmentManagerMap.containsKey("Research"));

        //Update the manager of one department using put() with the same key
        departmentManagerMap.put("HR", "Sarah Ahmed Updated");
        System.out.println("Updated Manager for HR: " + departmentManagerMap.get("HR"));
        System.out.println("Updated HashMap: " + departmentManagerMap);

        //Use remove() to delete one department record
        departmentManagerMap.remove("Sales");
        System.out.println("HashMap after removing Sales: " + departmentManagerMap);

        //Use size() to display the total number of records left
        System.out.println("Total departments left: " + departmentManagerMap.size());
    }
}
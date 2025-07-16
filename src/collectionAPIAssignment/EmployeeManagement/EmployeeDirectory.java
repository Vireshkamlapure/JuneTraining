package collectionAPIAssignment.EmployeeManagement;

import java.util.HashMap;
import java.util.Iterator;

public class EmployeeDirectory {

    HashMap<Integer , String> EmployeeDataDirectory = new HashMap<Integer, String>();

    void addEmployee(Integer id , String name){
        EmployeeDataDirectory.put(id,name);
    }

    void removeEmployee(Integer id){
        EmployeeDataDirectory.remove(id);
    }

    void displayAllEmployeeData(){
        for (Integer id : EmployeeDataDirectory.keySet())
            System.out.println("ID : "+id+" Name : "+EmployeeDataDirectory.get(id));
    }

    void displayEmployeeDetail(Integer id){
        for (Integer employee : EmployeeDataDirectory.keySet())
                if (employee == id)
                    System.out.println("ID : "+id+" Name : "+EmployeeDataDirectory.get(id));

    }

}

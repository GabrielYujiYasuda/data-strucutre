package lists;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        //Initializating the list
        List<EmployeeList> employeeList = new ArrayList<>();

        //Add objects (Employees) to the list
        employeeList.add(new EmployeeList("Jane", "Jones", 123));
        employeeList.add(new EmployeeList("John", "Doe", 4567));
        employeeList.add(new EmployeeList("Mary", "Smith", 22));
        employeeList.add(new EmployeeList("Mike", "Wilson", 3245));

        //System.out.println(employeeList.get(1));

        //Inserting emplyees
        employeeList.set(1, new EmployeeList("John", "Adans", 4568));
        employeeList.add(3, new EmployeeList("Gabriel", "Yasuda", 111111));

        //Getting employee by indeex
        System.out.println(employeeList.get(1));

        System.out.println("\nArray: ");

        //To array
        EmployeeList[] employeeArray = employeeList
                .toArray(new EmployeeList[employeeList.size()]);

        for (EmployeeList x: employeeArray)
            System.out.println(x);

        //Exploring lists
        System.out.println(employeeArray[1]);
        System.out.println(employeeList.contains(new EmployeeList("Mary", "Smith", 22)));
        System.out.println(employeeList.indexOf(new EmployeeList("John", "Adans", 4568)));
        employeeList.remove(2);
        employeeList.remove(new EmployeeList("Gabriel", "Yasuda", 111111));

        for (EmployeeList a: employeeList)
            System.out.println(a);
    }
}

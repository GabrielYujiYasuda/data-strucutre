package lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Initializating the list
        List<Employee> employeeList = new ArrayList<>();

        //Add objects (Employees) to the list
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        //System.out.println(employeeList.get(1));

        //Inserting emplyees
        employeeList.set(1, new Employee("John", "Adans", 4568));
        employeeList.add(3, new Employee("Gabriel", "Yasuda", 111111));

        //Getting employee by indeex
        System.out.println(employeeList.get(1));

        System.out.println("\nArray: ");

        //To array
        Employee[] employeeArray = employeeList
                .toArray(new Employee[employeeList.size()]);

        for (Employee x: employeeArray)
            System.out.println(x);

        //Exploring lists
        System.out.println(employeeArray[1]);
        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
        System.out.println(employeeList.indexOf(new Employee("John", "Adans", 4568)));
        employeeList.remove(2);
        employeeList.remove(new Employee("Gabriel", "Yasuda", 111111));

        for (Employee a: employeeList)
            System.out.println(a);
    }
}

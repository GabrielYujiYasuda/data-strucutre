package lists;

import java.util.List;

public class Vector {
    public static void main(String[] args) {

        //Thread safety
        List<EmployeeList> employeeList = new java.util.Vector<>();

        //Add objects (Employees) to the list
        employeeList.add(new EmployeeList("Jane", "Jones", 123));
        employeeList.add(new EmployeeList("John", "Doe", 4567));
        employeeList.add(new EmployeeList("Mary", "Smith", 22));
        employeeList.add(new EmployeeList("Mike", "Wilson", 3245));
    }
}

package linkedList;

public class EmployeeNode {

    private EmployeeLinked employee;
    private EmployeeNode next;

    public EmployeeNode(EmployeeLinked employee) {
        this.employee = employee;
    }

    //Gets & sets
    public EmployeeLinked getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeLinked employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public String toString() {
        return employee.toString();
    }
}
package linkedList;

public class LinkedTest {
    public static void main(String[] args) {

        //Initializating the list

        EmployeeLinked janeJones = new EmployeeLinked("Jane", "Jones", 123);
        EmployeeLinked johnDoe = new EmployeeLinked("John", "Doe", 4567);
        EmployeeLinked marySmith = new EmployeeLinked("Mary", "Smith", 765);
        EmployeeLinked mikeWilson = new EmployeeLinked("Mike", "Wilson", 4352);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();

    }
}

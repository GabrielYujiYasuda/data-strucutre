package linkedList;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(EmployeeLinked employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty())
            return null;

        EmployeeNode removeNode = head;
        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }

    public String getSize() {
        if (size < 1)
            return  "Empty!!!";

        return "Size: " + size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.println("Head \n ->");

        while (current != null) {
            System.out.println(current);
            System.out.println(" -> ");
            current = current.getNext();
        }

        System.out.println("null");
    }
}

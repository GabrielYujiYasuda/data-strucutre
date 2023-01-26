package queues;

public class QueueTest {
    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(10);
        EmployeeQueue gabriel = new EmployeeQueue("Gabriel", "Yasuda", 26);
        EmployeeQueue laura = new EmployeeQueue("Laura", "Ford", 26);
        EmployeeQueue linda = new EmployeeQueue("Linda", "Muller", 26);

        queue.add(gabriel);
        queue.add(laura);
        queue.add(linda);

        System.out.println("Size: " + queue.size());

        System.out.println(queue.peek());

        queue.remove();
        queue.remove();
        queue.remove();

        System.out.println(queue.size());
        queue.printQueue();
    }
}

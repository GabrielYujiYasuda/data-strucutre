package queues;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private EmployeeQueue[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new EmployeeQueue[capacity];
    }

    public void add(EmployeeQueue employeeQueue) {
        if (back == queue.length) {
            //resize
            EmployeeQueue newArray[] = new EmployeeQueue[queue.length * 2];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back] = employeeQueue;
        back++;
    }

    public EmployeeQueue remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        EmployeeQueue employee = queue[front];
        queue[front] = null;
        front++;

        //setting queue to empty again+
        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return employee;
    }

    public EmployeeQueue peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public int size() {
        return back - front;
    }

    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }

}

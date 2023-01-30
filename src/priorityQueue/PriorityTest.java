package priorityQueue;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityTest {
    public static void main(String[] args) {

        PriorityQueue pq = new PriorityQueue();

        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        pq.add(6);
        pq.add(7);
        pq.add(-1);
        pq.add(-2);

        //Get the item with most priority
        System.out.println(pq.peek());

        //Delete the item with the highest priority
        System.out.println(pq.remove());
        System.out.println(pq.remove());

        //Same as remove
        System.out.println(pq.poll());
        System.out.println(pq.remove(5));

        //Transforming the priority queue into array of objects
        Object[] itens = pq.toArray();

        for (Object item: itens)
            System.out.println(item);

    }
}

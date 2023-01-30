package heaps;

public class HeapTest {
    public static void main(String[] args) {

        Heap heap = new Heap(10);

        heap.insert(2);
        heap.insert(24);
        heap.insert(76);
        heap.insert(32);
        heap.insert(98);
        heap.insert(41);
        heap.insert(65);
        heap.insert(45);
        heap.insert(58);

//        heap.printHeap();
//        heap.delete(2);
//        heap.printHeap();
//        System.out.println(heap.peek());

        heap.printHeap();
        heap.sort();
        heap.printHeap() ;
    }
}

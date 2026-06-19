
import java.util.ArrayList;

public class MainHeap {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();
        heap.insert(65);
        heap.insert(99);
        heap.insert(43);
        heap.insert(23);
        heap.insert(26);

        System.out.println(heap.remove());
        System.out.println(heap.remove());

        ArrayList list = heap.heapSort();
        System.out.println(list);

    }
}

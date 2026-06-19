public class MaxHeap {
    int size = 0;
    int maxsize = 0;
    int[] heap;

    public MaxHeap(int maxsize) {
        this.maxsize = maxsize;
        this.size = 0;
        heap = new int[maxsize];
    }

    private int parent(int pos) {
        return (pos - 1) / 2;
    }

    private int leftchild(int pos) {
        return (2 * pos) + 1;
    }

    private int rightchild(int pos) {
        return (2 * pos) + 2;
    }

    private boolean isLeaf(int pos) {
        if (pos >= (size / 2) && pos < size) {
            return true;
        }
        return false;
    }

    private void swap(int fpos, int spos) {
        int temp = heap[fpos];
        heap[fpos] = heap[spos];
        heap[spos] = temp;
    }

    public void insert(int ele) {
        heap[size] = ele;
        int curr = size;
        while (curr > 0 && heap[curr] > heap[parent(curr)]) {
            swap(curr, parent(curr));
            curr = parent(curr);
        }
        size++;
    }

    private void print() {
        for (int i = 0; i < size / 2; i++) {
            System.out.print("Parent:" + heap[i] + " ");

            if (leftchild(i) < size)
                System.out.print("Left:" + heap[leftchild(i)] + " ");
            if (rightchild(i) < size)
                System.out.print("Right:" + heap[rightchild(i)] + " ");
            System.out.println();
        }
    }

    public static void main(String args[]) {
        System.out.println("The Max Heap is ");
        MaxHeap maxHeap = new MaxHeap(15);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);
        maxHeap.print();
    }
}

class CustomQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;

    public CustomQueue(int capacity) {
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) throws Exception {
        if (size == arr.length)
            throw new Exception("Queue Overflow");
        rear = (rear + 1) % arr.length;
        arr[rear] = value;
        size++;
    }

    public int dequeue() throws Exception {
        if (size == 0)
            throw new Exception("Queue Underflow");
        int val = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return val;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }
}

// Usage example:
public class CustomQueueDemo {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(3);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue()); // Output: 10
        System.out.println(queue.dequeue()); // Output: 20
    }
}

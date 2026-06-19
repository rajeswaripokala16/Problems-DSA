class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class DynamicQueue {
    private Node front;
    private Node rear;

    public DynamicQueue() {
        front = null;
        rear = null;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue() throws Exception {
        if (front == null) {
            throw new Exception("Queue Underflow");
        }
        int val = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return val;
    }

    public boolean isEmpty() {
        return front == null;
    }
}

// Usage example:
public class DynamicQueueDemo {
    public static void main(String[] args) throws Exception {
        DynamicQueue queue = new DynamicQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println(queue.dequeue()); // Output: 10
        System.out.println(queue.dequeue()); // Output: 20
    }
}

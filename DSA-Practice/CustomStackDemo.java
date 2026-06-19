class StackException extends Exception {
    public StackException(String message) {
        super(message);
    }
}

class CustomStack {
    private int[] arr;
    private int top;
    private int size;

    public CustomStack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    public void push(int value) throws StackException {
        if (top == size - 1) {
            throw new StackException("Stack Overflow");
        }
        arr[++top] = value;
    }

    public int pop() throws StackException {
        if (top == -1) {
            throw new StackException("Stack Underflow");
        }
        return arr[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class CustomStackDemo {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(5);
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop()); // Output: 20
    }
}

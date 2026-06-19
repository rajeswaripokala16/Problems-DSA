class DynamicStack {
    private int[] arr;
    private int top;

    public DynamicStack() {
        arr = new int[2]; // start small, grow as needed
        top = -1;
    }

    public void push(int value) {
        if (top == arr.length - 1) {
            // stack is full, double the size
            int[] newArr = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[++top] = value;
    }

    public int pop() throws Exception {
        if (top == -1)
            throw new Exception("Stack Underflow");
        return arr[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

// Usage example:
public class DynamicStackDemo {
    public static void main(String[] args) throws Exception {
        DynamicStack stack = new DynamicStack();
        stack.push(1);
        stack.push(2);
        stack.push(3); // triggers array resize
        System.out.println(stack.pop()); // Output: 3
    }
}

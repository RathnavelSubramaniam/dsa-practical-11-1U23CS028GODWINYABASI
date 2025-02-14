import java.util.*;

public class ArrayStack {
    protected int capacity;
    protected int[] stack;
    protected int top = -1;

    // Constructor to initialize stack with given capacity
    public ArrayStack(int cap) {
        capacity = cap;
        stack = new int[capacity]; 
    }

    // Method to return the size of the stack
    public int size() {
        return (top + 1);
    }

    // Method to push an element into the stack
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + data);
        } else {
            stack[++top] = data;  // Increase top and insert the element
            System.out.println("Pushed Element: " + data);
        }
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! No elements to pop.");
            return -1;  // Return -1 if stack is empty
        } else {
            return stack[top--];  // Return top element and decrease top
        }
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to display all elements in the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Underflow. No elements to display in Empty Stack");
        } else {
            System.out.println("Stack Elements: Top of the Stack Element is");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    // Main method to test the stack operations
    public static void main(String[] args) {
        ArrayStack s = new ArrayStack(5);  // Create stack with capacity 5
        Scanner sc = new Scanner(System.in);
        int data, ch;

        do {
            System.out.println("\n1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display Stack");
            System.out.println("4.Exit\n");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1: 
                    System.out.print("Enter the element to insert: ");
                    data = sc.nextInt();
                    s.push(data);
                    break;
                case 2:
                    data = s.pop();
                    if (data != -1)
                        System.out.println("Popped Element: " + data);
                    break;
                case 3:
                    s.display();
                    break;
            }
        } while (ch < 4);
    }
}


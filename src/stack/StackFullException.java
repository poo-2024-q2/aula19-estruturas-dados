package stack;

public class StackFullException extends Exception {
    public StackFullException(int size, int capacity) {
        super(String.format("Stack is full. Size: %d. Capacity: %d", 
            size, capacity));
    }
}
package stack;

public class StackEmptyException extends Exception {
    public StackEmptyException(int size, int capacity) {
        super(String.format("Stack is empty. Size: %d. Capacity: %d", 
            size, capacity));
    }
}

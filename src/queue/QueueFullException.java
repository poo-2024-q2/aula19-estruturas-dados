package queue;

public class QueueFullException extends Exception {
    public QueueFullException(int size, int capacity) {
        super(String.format("Queue is full. Size: %d. Capacity: %d", 
            size, capacity));
    }
}
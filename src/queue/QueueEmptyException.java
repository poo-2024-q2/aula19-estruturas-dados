package queue;

public class QueueEmptyException extends Exception {
    public QueueEmptyException(int size, int capacity) {
        super(String.format("Queue is empty. Size: %d. Capacity: %d", 
            size, capacity));
    }
}

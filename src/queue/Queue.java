package queue;

public interface Queue {
    void enqueue(int element) throws QueueFullException;
    int dequeue() throws QueueEmptyException;
    int rear() throws QueueEmptyException;
    int front() throws QueueEmptyException;
    int size();
    int capacity();
    boolean isEmpty();
    boolean isFull();
}

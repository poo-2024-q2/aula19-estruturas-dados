package queue;

public class CircularQueue implements Queue {
    private int size;
    private int[] elements;
    private int front;
    private int back;

    public CircularQueue(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Invalid capacity");
        }
        elements = new int[capacity];
        size = 0;
        front = 0;
        back = 0;
    }

    @Override
    public void enqueue(int element) throws QueueFullException {
        if (isFull()) {
            throw new QueueFullException(size(), capacity());
        }
        elements[back] = element;
        back = (back + 1) % capacity();
        size++;
    }

    @Override
    public int dequeue() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException(size(), capacity());
        }
        int element = elements[front];

        front = (front + 1) % capacity();
        size--;

        return element;
    }

    public void clear() {
        front = 0;
        back = 0;
        size = 0;
    }

    @Override
    public int rear() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException(capacity(), size);
        }
        return elements[(back - 1 + capacity()) % capacity()];
    }

    @Override
    public int front() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException(capacity(), size);
        }
        return elements[front];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        return elements.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == capacity();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("Queue front -> [");
        if (size == 1) {
            builder.append(elements[front]);
        } else if (size > 1) {
            int i = 0;
            int cur = front;

            while (i < size - 1) {
                builder.append(elements[cur]);
                builder.append(", ");
                cur = (cur + 1) % capacity();
                i++;
            }
            builder.append(elements[cur]);
        }
        builder.append("] <- rear");

        return builder.toString();
    }
}

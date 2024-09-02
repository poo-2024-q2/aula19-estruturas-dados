package queue;

public class Main {
    public static void main(String[] args) {
        try {
            Queue queue = new CircularQueue(5);

            System.out.println(queue);
            for (int i = 0; i < 5; i++) {
                queue.enqueue(i + 1);
                System.out.println(queue);
            }
            // queue.enqueue(10);
            while (!queue.isEmpty()) {
                System.out.println("Dequeing: " + queue.dequeue());
                System.out.println(queue);
            }
        } catch(QueueFullException e) {
            e.printStackTrace();
        } catch(QueueEmptyException e) {
            e.printStackTrace();
        }
    }
}

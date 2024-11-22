interface QueueImpl {
    void push(int value) throws Exception;
    int pop() throws Exception;
    void display();
}

class QueueDemo implements QueueImpl {
    private int[] queue;
    private int front;
    private int rear;
    private final int capacity;

    public QueueDemo(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = 0;
    }

    public void push(int value) throws Exception {
        if (rear == capacity) {
            throw new Exception("Overflow");
        }
        queue[rear++] = value;
    }

    public int pop() throws Exception {
        if (front == rear) {
            throw new Exception("Underflow");
        }
        int removed = queue[front++];
        System.out.println(removed);
        return removed;
    }
    public void display() {
        if (front == rear) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

public class QueueTest {
    public static void main(String[] args) {
        QueueDemo queue = new QueueDemo(10);

        try {
            queue.push(10);
            queue.push(20);
            queue.push(30);
            queue.push(40);
            queue.display();

            queue.pop();
            queue.pop();
            queue.display();

            queue.push(50);
            queue.push(60);
            queue.display();

            for (int i = 0; i < 10; i++) {
                queue.pop();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

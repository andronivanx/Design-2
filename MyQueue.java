

public class MyQueue {

    private int array[];
    private int front;
    private int rear;
    private int queueSize;
    private int currentSize;

    public MyQueue(int size) {
        this.queueSize = size;
        front = 0;
        rear = -1;
        array = new int[queueSize];
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Can not add more elements");
        } else {
            rear++;
            if (rear == queueSize - 1) {
                rear = 0;
            }
            array[rear] = value;
            currentSize++;
            System.out.println(value + " added to the queue");
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Can't dequeue element");
        } else {
            front++;
            if (front == queueSize - 1) {
                System.out.println(array[front - 1] + " removed from the queue");
                front = 0;
            } else {
                System.out.println(array[front - 1] + " removed from the queue");
            }
            currentSize--;
        }
    }

    public int peek() {
        return array[front];
    }

    public boolean isFull() {
        if (currentSize == queueSize) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {

        if (currentSize == 0) {
            return true;
        }
        return false;

    }

    public static void main(String a[]) {
        MyQueue queue = new MyQueue(5);
        queue.push(5);
        queue.push(6);
        queue.pop();
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
    }
}

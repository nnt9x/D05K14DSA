package hangdoi_generic;


import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    private int capacity;
    private int front = -1;
    private int rear = -1;
    private List<T> items;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>(capacity);
    }

    public boolean isFull() {
        if (front == 0 && rear == capacity - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (front == -1 && rear == -1) {
            return true;
        }
        return false;
    }

    public void enqueue(T t) {
        if (isFull()) {
            throw new RuntimeException("Hàng đợi đã đầy!");
        }
        if (front == -1) {
            front = 0;
        }
        rear++;
        items.add(t);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Hàng đợi rỗng!");
        }
        T t = items.get(front);
        front++;
        if (front > rear) {
            front = rear = -1;
        }
        return t;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Hàng đợi rỗng");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(items.get(i) + "<--");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Hàng đợi rỗng";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = front; i <= rear; i++) {
            stringBuilder.append(items.get(i));
            stringBuilder.append("<--");
        }
        return stringBuilder.toString();
    }
}

package queue_adt;

import java.util.ArrayList;
import java.util.List;

public class QueueImpl<T> implements Queue<T> {
    // Thuộc tinh
    private int capacity;
    private List<T> items;

    // Phương thức khởi tạo
    public QueueImpl(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>(capacity);
    }

    @Override
    public boolean enqueue(T t) {
        if (isFull()) {
            return false;
        }
        items.add(t);
        return true;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) return null;
        T tmp = items.get(0);
        items.remove(0);
        return tmp;
    }

    @Override
    public T peek() {
        if (isEmpty()) return null;
        T tmp = items.get(0);
        return tmp;
    }

    @Override
    public boolean isFull() {
        if (items.size() == capacity) return true;
        return false;
    }

    @Override
    public boolean isEmpty() {
        if (items.size() == 0) return true;
        return false;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Queue: ");
        for (int i = 0; i < items.size(); i++) {
            builder.append(items.get(i) + "<--");
        }
        return builder.toString();
    }
}

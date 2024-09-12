package buoi5;

import java.util.ArrayList;
import java.util.List;

public class StackImpl<T> implements Stack<T> {
    // Thuộc tính
    private int capacity;
    // Dùng List triển khai
    private List<T> items;

    public StackImpl(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>(capacity);
    }

    @Override
    public void push(T t) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        items.add(t);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T tmp = items.get(items.size() - 1);
        items.remove(tmp);
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
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Stack is empty";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Stack: \n");
        int top = items.size() - 1;
        for (int i = top; i >= 0; i--) {
            stringBuilder.append(items.get(i) + "\n");
        }
        return stringBuilder.toString();
    }
}

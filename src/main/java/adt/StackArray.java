package adt;

import java.util.Arrays;

public class StackArray<T> implements Stack<T> {
    // Thuộc tính
    private int capacity;
    private int top = -1;
    private T[] items;
    // Phương thức khởi tạo

    public StackArray(int capacity) {
        this.capacity = capacity;
        this.items = (T[]) new Object[capacity];
    }

    @Override
    public void push(T t) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        top = top + 1;
        items[top] = t;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T tmp = items[top];
        top = top - 1;
        return tmp;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T tmp = items[top];
        return tmp;
    }

    @Override
    public boolean isFull() {
        if (top == capacity - 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if (top == -1) return true;
        return false;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Stack is empty!";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("Stack: \n");
        for (int i = top; i >= 0; i--) {
            builder.append(items[i] + "\n");
        }
        return builder.toString();
    }
}

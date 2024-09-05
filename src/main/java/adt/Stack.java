package adt;

public interface Stack<T> {
    void push(T t);

    T pop();

    T peek();

    boolean isFull();

    boolean isEmpty();

    String toString();
}

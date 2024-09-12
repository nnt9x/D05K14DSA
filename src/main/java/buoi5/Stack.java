package buoi5;

public interface Stack<T> {
    void push(T t);

    T pop();

    boolean isFull();

    boolean isEmpty();

    void display();

    String toString();
}

package buoi8;

public interface Queue<T> {
    public void enqueue(T t);

    public T dequeue();

    public T peek();

    public boolean isFull();

    public boolean isEmpty();

    public void display();
}

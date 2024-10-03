package buoi8;

public class SimpleQueue<T> implements Queue<T> {
    // Thuộc tính
    private int capacity;
    // Danh sách phần tử
    private LinkedList<T> items;

    public SimpleQueue(int capacity) {
        this.capacity = capacity;
        this.items = new SinglyLinkedList<>();
    }

    @Override
    public void enqueue(T t) {
        // Thêm vào cuối hàng đợi
        items.insertAtEnd(t);
    }

    @Override
    public T dequeue() {
        if(isEmpty()){
            throw new RuntimeException("Queue is empty!");
        }
        return items.deleteAtBegin();
    }

    @Override
    public T peek() {
        return items.getHead();
    }

    @Override
    public boolean isFull() {
        return items.size() == capacity;
    }

    @Override
    public boolean isEmpty() {
        return items.size() == 0;
    }

    @Override
    public void display() {
        if(isEmpty()){
            System.out.println("Linked list is empty!");
        }
        items.display();
    }
}

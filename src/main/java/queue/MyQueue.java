package queue;

// Triển khai dựa trên mảng
public class MyQueue {

    private int capacity; // kích thước khởi tạo
    private int[] items; // mang chua cac phan tu
    private int front = -1;
    private int rear = -1;

    // Phương thức khởi tạo
    public MyQueue(int capacity) {
        this.capacity = capacity;
        this.items = new int[capacity];
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

    public void enqueue(int item) {
        if (isFull()) {
            throw new RuntimeException("Hàng đợi đã đầy!");
        }
        // Chưa đầy -> thêm phần tử?
        if (front == -1) {
            front++;
        }
        rear++;
        // Gan gia tri cho vi tri rear
        items[rear] = item;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Hàng đợi rỗng!");
        }
        int head = items[front];
        // Tăng front 1 đơn vị
        front++;
        if (front > rear) {
            front = rear = -1;
        }
        return head;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Hàng đợi rỗng!");
        }
        return items[front];
    }

    public int size() {
        if (isEmpty()) return 0;
        return (rear - front + 1);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Hàng đợi rỗng!");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(items[i]);
            System.out.print("<--");
        }
        System.out.println();
    }

}

package nganxep;

public class StackNumber {
    // Thuộc tính
    private int capacity;
    private int top = -1;
    private int[] items;

    // Khởi tạo
    public StackNumber(int capacity) {
        this.capacity = capacity;
        this.items = new int[capacity];
    }

    // Cac phep toan
    public boolean isFull() {
        if (top == capacity - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public void push(int e) {
        if (isFull()) {
            throw new RuntimeException("Ngăn xếp đã đầy!");
        }
        top = top + 1;
        items[top] = e;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Ngăn xếp rỗng!");
        }
        int e = items[top];
        top = top - 1;
        return e;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Hàng đợi rỗng!");
            return;
        }
        System.out.println("Ngăn xếp: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(items[i]);
        }
    }
}

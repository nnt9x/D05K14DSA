package ds_lkd;


public interface LinkedList<T> {
    // Phép toán
    public void insertAtBegin(T t);

    public void insertAtEnd(T t);

    public void insertAtPosition(int index, T t);

    public T deleteAtBegin();

    public T deleteAtEnd();

    public T deleteAtPosition(int index);

    // Kich thuoc cua danh sach
    public int size();

    public void display();

    public String toString();
}

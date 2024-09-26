package buoi7;

public class LinkedListImpl<T> implements LinkedList<T> {

    private Node<T> head;
    private int size;


    public LinkedListImpl() {
        this.size = 0;
        this.head = null;
    }

    @Override
    public void insertAtBegin(T t) {
        Node tmp = new Node(t);
        if (size == 0) {
            head = tmp;
            size++;
            return;
        }
        // Trỏ tmp => head hiện tại
        tmp.setNext(head);
        // tmp hiện tại => head mới
        head = tmp;
        size++;
    }

    @Override
    public void insertAtEnd(T t) {
        Node tmp = new Node(t);
        if (size == 0) {
            head = tmp;
            size++;
            return;
        }
        // Tìm node cuối hiện tại
        Node node = head;
        while (node.getNext() != null) {
            node = node.getNext();
        }
        node.setNext(tmp);
        size++;
    }

    @Override
    public void insertAtPosition(int index, T t) {
        if (index == 0) {
            insertAtBegin(t);
        } else if (index == size) {
            insertAtEnd(t);
        } else if (index > 0 && index < size) {
            Node tmp = new Node(t);
            // Cần tìm vị trí index - 1 và index
            // (index-1) -> tmp -> index
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.getNext();
            }
            // Current: index
            Node curr = prev.getNext();
            prev.setNext(tmp);
            tmp.setNext(curr);
            size++;
        } else {
            throw new RuntimeException("Vị trí không hợp lệ!");
        }
    }

    @Override
    public T deleteAtBegin() {
        return null;
    }

    @Override
    public T deleteAtEnd() {
        return null;
    }

    @Override
    public T deleteAtPosition(int index) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void display() {
        Node<T> node = head;
        while (node != null) {
            System.out.print(node.getData() + "-->");
            node = node.getNext();
        }
        System.out.println("End");
    }
}

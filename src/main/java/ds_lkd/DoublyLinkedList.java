package ds_lkd;

public class DoublyLinkedList<T> implements LinkedList<T> {
    private Node<T> head;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public void insertAtBegin(T t) {
        // TH1: chưa có phần tử nào
        Node<T> tmp = new Node<>(t);
        if (size == 0) {
            head = tmp;
            size++;
            return;
        }
        // TH2: có ít nhất 1 phần tử
        tmp.setNext(head);
        head.setPrev(tmp);
        head = tmp;
        size++;
    }

    @Override
    public void insertAtEnd(T t) {
        if (size == 0) {
            insertAtBegin(t);
            return;
        }
        // Tạo node
        Node<T> tmp = new Node<>(t);

        Node<T> lastNode = head;
        while (lastNode.getNext() != null) {
            lastNode = lastNode.getNext();
        }
        // đã có dc phần tử cuối hiện tại (lastNode)
        lastNode.setNext(tmp);
        tmp.setPrev(lastNode);
        size++;
    }

    @Override
    public void insertAtPosition(int index, T t) {
        if (index < 0 || index > size - 1) {
            throw new RuntimeException("Index out of bound");
        }
        if (index == 0) {
            insertAtBegin(t);
        } else if (index == size - 1) {
            insertAtEnd(t);
        } else {
            // Them vao giua: index -1, index
            Node<T> prev = head; // index -1
            for (int i = 0; i < index - 1; i++) {
                prev = prev.getNext();
            }
            // index
            Node current = prev.getNext();
            // Cat lien ket
            prev.setNext(null);
            current.setPrev(null);

            // Tao lien ket
            Node tmp = new Node(t);

            prev.setNext(tmp);
            tmp.setPrev(prev);

            tmp.setNext(current);
            current.setPrev(tmp);

            size++;

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
        return 0;
    }

    @Override
    public void display() {
        Node<T> node = head;
        while (node != null) {
            System.out.print(node.getData() + "<-->");
            node = node.getNext();
        }
        System.out.println("End");
    }
}

package buoi6.dslkdon.linkedlist_singly;

public class LinkedList<T> {
    // Thuoc tinh Node: head
    private Node<T> head;

    public LinkedList() {
        head = null;
    }

    // Them vao dau hang
    public void insertAtBegin(T t) {
        // B1: Tạo Node
        Node<T> tmp = new Node<>(t);
        // B2: Kiem tra head = null hay ko?
        if (head == null) {
            head = tmp;
            return;
        }
        // B3: Neu head ko null ?
        tmp.setNext(head);
        // B4: Dat lai head ve tmp
        head = tmp;
    }

    // Ham display
    public void display() {
        Node<T> node = head;
        while (node != null) {
            System.out.print(node.getData() + "-->");
            node = node.getNext();
        }
        System.out.println("End");
    }
}

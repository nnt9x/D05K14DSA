package ds_lkd;

public class Main {
    public static void main(String[] args) {
        LinkedList<Double> linkedList = new DoublyLinkedList<>();
        linkedList.insertAtBegin(10.5);
        linkedList.insertAtBegin(20.5);

        // Them vao cuoi
        linkedList.insertAtEnd(30.5);

        linkedList.display();

        // Them 1 phan tu vao index = 1
        linkedList.insertAtPosition(1, 9.5);

        linkedList.display();
    }
}

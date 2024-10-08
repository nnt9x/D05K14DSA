package buoi6.dslkdon.linkedlist_singly;

public class Main {
    public static void main(String[] args) {
        LinkedList<Double> linkedList = new LinkedList<>();
        linkedList.insertAtBegin(1.5);
        linkedList.insertAtBegin(3.5);
        linkedList.insertAtBegin(-5.0);
        linkedList.insertAtBegin(4.0);
        linkedList.insertAtBegin(10.0);

        linkedList.insertAtEnd(20.0);
        linkedList.insertAtEnd(30.0);
        linkedList.insertAtBegin(0.0);

        // Display
        linkedList.display();
        // 0.0-->10.0-->4.0-->-5.0-->3.5-->1.5-->20.0-->30.0-->End

        linkedList.deleteAtBegin();
        linkedList.deleteAtBegin();

        // Xoa phan tu cuoi hang
        linkedList.deleteAtEnd();
        linkedList.deleteAtEnd();


        linkedList.display();
    }
}

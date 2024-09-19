package buoi6.dslkdon.linkedlist_singly;

public class Main {
    public static void main(String[] args) {
        LinkedList<Double> linkedList = new LinkedList<>();
        linkedList.insertAtBegin(1.5);
        linkedList.insertAtBegin(3.5);
        linkedList.insertAtBegin(-5.0);
        linkedList.insertAtBegin(4.0);
        linkedList.insertAtBegin(10.0);

        // Display
        linkedList.display();
    }
}

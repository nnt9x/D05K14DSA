package buoi7;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedListImpl<>();
        linkedList.insertAtBegin(10);
        linkedList.insertAtBegin(20);

        linkedList.insertAtEnd(30);

        // 20 -> 10 -> 30
        // Insert 40 vao vi tri index = 1
        // 20 -> 40 -> 10 -> 30

        linkedList.insertAtPosition(1, 40);
        linkedList.display();

        linkedList.insertAtPosition(0, 60);
        linkedList.display();
        System.out.println(linkedList.size());

    }
}

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
    // Them 1 phan tu vao cuoi
    public void insertAtEnd(T t){
        // B1: tao node
        Node<T> tmp = new Node<>(t);
        // B2: kiem tra head = null hay ko?
        if(head == null){
            head = tmp;
            return;
        }
        // B3: head khong bang null ? => co du lieu
        // Tim node cuoi hien tai
        Node node = head;
        while(node.getNext() != null){
            node = node.getNext();
        }
        // Da tim dc node cuoi
        node.setNext(tmp);
    }
    public void deleteAtBegin(){
        // TH1: khong co phan tu nao
        if(head == null){
            throw new RuntimeException("Linked list is empty");
        }
        // TH2: chi co 1 phan tu head
        if(head.getNext() == null){
            head = null;
        }
        else {
            // TH3: co it nhat 2 phan tu
            Node newHead = head.getNext();
            // Xoa lien ket
            head.setNext(null);
            // Tro head -> newHead
            head = newHead;
        }
    }

    public void deleteAtEnd(){
        // TH1: ko co phan tu
        if(head == null){
            throw new RuntimeException("Linked list is empty");
        }
        // TH2: co 1 phan tu
        if(head.getNext() == null){
            head = null;
        }
        // TH3: co nhieu hon 2 phan tu
        else{
            // Tim ra phan tu gan cuoi ?
            // Node.getNext().getNext() = null
            Node node = head;
            while (node.getNext().getNext() != null){
                node = node.getNext();
            }
            // Da co gan cuoi
            node.setNext(null);
        }
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

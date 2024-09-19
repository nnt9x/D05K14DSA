package buoi6.dslkdon;

public class Main {
    public static void main(String[] args) {

        Node<Double> node1 = new Node<>(1.5);
        Node<Double> node2 = new Node<>(3.5);
        Node<Double> node3 = new Node<>(-5.0);
        Node<Double> node4 = new Node<>(4.0);
        Node<Double> node5 = new Node<>(10.0);

        // Lien ket cac node
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

        // Duyet cac phan tu trong linked list
        // head: trỏ vào pt đầu tiên
        // Phần tử cuối: next = null

        Node node = node1;
        while (node != null){
            System.out.print(node.getData()+"-->");
            node = node.getNext();
        }
    }
}

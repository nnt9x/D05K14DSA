package buoi9;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Tao node
        Node node1 = new Node(1);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node9 = new Node(9);
        Node node12 = new Node(12);
        // Tao cay: lien ket cac node
        node1.setLeft(node12);
        node1.setRight(node9);
        node12.setLeft(node5);
        node12.setRight(node6);

        // Node root -> node 1
        Node root = node1;

        // Trien khai bang Stack: sử dụng Stack có sẵn
        Stack<Node> stack = new Stack<>();

        // Duyet inorder
        Node node = root;
        while (node != null || !stack.isEmpty()) {
            // Duyet sang trai - ngoai cung
            while (node != null) {
                // Them node vao stack
                stack.push(node);
                node = node.getLeft();
            }
            // Lay du lieu stack hien -> in
            node = stack.pop();
            System.out.print(node.getData()+"-->");
            // Duyet sang phai
            node = node.getRight();
        }

    }
}

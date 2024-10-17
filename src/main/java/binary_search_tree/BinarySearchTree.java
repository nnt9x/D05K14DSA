package binary_search_tree;

import java.util.Stack;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    // insert
    public void insert(int e) {
        Node node = new Node(e);
        // TH1: chưa có phần tử nào ?
        if (root == null) {
            root = node;
            return;
        }
        // TH2: có ít nhất 1 phần tử
        Node curr = root;
        while (true) {
            if (curr.getData() < e) {
                // Duyet sang phai
                if (curr.getRight() == null) {
                    curr.setRight(node);
                    break;
                } else {
                    // tiep tuc duyet phai
                    curr = curr.getRight();
                }
            } else if (curr.getData() > e) {
                // duyet sang trai
                if (curr.getLeft() == null) {
                    curr.setLeft(node);
                    break;
                } else {
                    // tiep tuc duyet trai
                    curr = curr.getLeft();
                }
            } else {
                // Neu cay da co gia tri e
                break;
            }
        }
    }

    // search

    // inorder
    public void inorder() {
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
            System.out.print(node.getData() + "-->");
            // Duyet sang phai
            node = node.getRight();
        }
    }

}

package binary_search_tree_adt;

import java.util.Stack;

public class BinarySearchTreeImpl<T extends Comparable<T>>
        implements BinarySearchTree<T> {
    private Node<T> root;

    public BinarySearchTreeImpl() {
        this.root = null;
    }

    @Override
    public void insert(T t) {
        Node<T> newNode = new Node<>(t);

        // Th1: chua co phan tu nao
        if (root == null) {
            root = newNode;
            return;
        }
        // Th2: co it nhat 1 phan tu, duyet trai hoac phai
        Node<T> node = root;
        while (true) {
            // Node đang xét = giá trị t,
            if (node.getData().compareTo(t) == 0) {
                break;
            }
            // Node đang xét < giá trị t -> sang phải
            if (node.getData().compareTo(t) < 0) {
                // Sang phai
                if (node.getRight() == null) {
                    node.setRight(newNode);
                    break;
                } else {
                    // Duyet tiep sang phai
                    node = node.getRight();
                }

            } else {
                // Sang trai
                if (node.getLeft() == null) {
                    node.setLeft(newNode);
                    break;
                } else {
                    // Duyet tiep sang phai
                    node = node.getLeft();
                }
            }
        }
    }

    @Override
    public void inorder() {
        Stack<Node> stack = new Stack<>();
        // Duyet inorder
        Node<T> node = root;
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

    @Override
    public T search(T t) {
        Node<T> newNode = new Node<>(t);

        if (root == null) {
            return null;
        }
        // Th2: co it nhat 1 phan tu, duyet trai hoac phai
        Node<T> node = root;
        while (true) {
            // Node đang xét = giá trị t,
            if (node.getData().compareTo(t) == 0) {
                return node.getData();
            }
            // Node đang xét < giá trị t -> sang phải
            if (node.getData().compareTo(t) < 0) {
                // Sang phai
                if (node.getRight() == null) {
                    return null;
                } else {
                    // Duyet tiep sang phai
                    node = node.getRight();
                }

            } else {
                // Sang trai
                if (node.getLeft() == null) {
                    return null;
                } else {
                    // Duyet tiep sang phai
                    node = node.getLeft();
                }
            }
        }
    }
}

package binary_search_tree_adt;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Double> binarySearchTree = new BinarySearchTreeImpl<>();
        binarySearchTree.insert(8.0);
        binarySearchTree.insert(3.0);
        binarySearchTree.insert(10.0);
        binarySearchTree.insert(1.0);
        binarySearchTree.insert(6.0);
        binarySearchTree.insert(4.0);

        // In ra theo inorder
        binarySearchTree.inorder();
        System.out.println();

        // Kiem tra xem gia tri 15 co ton tai trong binarysearch hay ko?
        System.out.println(binarySearchTree.search(6.0));

        // Cay nhi phan tim kiem chua sinh vien ?
        BinarySearchTree<Student> binarySearchTree1 = new BinarySearchTreeImpl<Student>();

        binarySearchTree1.insert(new Student(8,"SV 8", "BKACAD"));
        binarySearchTree1.insert(new Student(3,"SV 3", "BKACAD"));
        binarySearchTree1.insert(new Student(10,"SV 10", "BKACAD"));
        binarySearchTree1.insert(new Student(1,"SV 1", "BKACAD"));
        binarySearchTree1.insert(new Student(6,"SV 6", "BKACAD"));
        binarySearchTree1.insert(new Student(4,"SV 4", "BKACAD"));

        // In ra inorder
        binarySearchTree1.inorder();
        // Co ban sinh vien ma 10 hay ko ?
        Student s = new Student();
        s.setId(10);

        System.out.println();
        Student result = binarySearchTree1.search(s);
        System.out.println(result);
    }
}

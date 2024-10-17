package binary_search_tree_adt;

public interface BinarySearchTree<T> {
    public void insert(T t);

    public void inorder();

    public T search(T t);
}

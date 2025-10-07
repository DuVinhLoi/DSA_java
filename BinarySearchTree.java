
public class BinarySearchTree<T extends Comparable<T>> { // T phải so sánh được
    TreeNode<T> root;

    // Chèn nút mới vào cây
    TreeNode<T> insert(TreeNode<T> root, T value) {
        if (root == null)
            return new TreeNode<>(value);

        if (value.compareTo(root.data) < 0)
            root.left = insert(root.left, value);
        else if (value.compareTo(root.data) > 0)
            root.right = insert(root.right, value);

        return root;
    }

    // Tìm kiếm
    boolean search(TreeNode<T> root, T key) {
        if (root == null) return false;

        if (root.data.equals(key))
            return true;
        else if (key.compareTo(root.data) < 0)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    // Duyệt Inorder
    void inorder(TreeNode<T> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.root = tree.insert(tree.root, 10);
        tree.insert(tree.root, 5);
        tree.insert(tree.root, 15);
        tree.insert(tree.root, 7);
        tree.insert(tree.root, 3);

        System.out.print("Duyệt Inorder: ");
        tree.inorder(tree.root);

        System.out.println("\nTìm 7? " + tree.search(tree.root, 7));
        System.out.println("Tìm 8? " + tree.search(tree.root, 8));
    }
}

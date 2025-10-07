class TreeNode<T> {
    T data;
    TreeNode<T> left;
    TreeNode<T> right;

    public TreeNode(T data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BinaryTree<T> {
    TreeNode<T> root; // Nút gốc

    public BinaryTree(T data) {
        root = new TreeNode<T>(data);
    }

    public BinaryTree() {
        root = null;
    }

    // Duyệt cây theo thứ tự giữa (Inorder)
    void inorder(TreeNode<T> node) {
        if (node == null) return; 
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        // Tạo cây
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.root = new TreeNode<>(10);
        tree.root.left = new TreeNode<>(5);
        tree.root.right = new TreeNode<>(15);
        tree.root.left.left = new TreeNode<>(3);
        tree.root.left.right = new TreeNode<>(7);

        // In thứ tự duyệt Inorder
        System.out.print("Duyệt Inorder: ");
        tree.inorder(tree.root);
    }
}

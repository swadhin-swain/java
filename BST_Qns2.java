// validate BST

public class BST_Qns2 {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (root.data > data) {
            // left subtree
            root.left = insert(root.left, data);
        } else {
            // right subtree
            root.right = insert(root.right, data);
        }

        return root;
    }

    // function for valid BST
    public static boolean isVaildBST(Node root, Node min ,Node max) {
        if (root == null) {
            return true;
        }

        if (min != null && root.data <= min.data) {
            return false;
        }
        else if (max != null && root.data >= max.data) {
            return false;
        }

        return isVaildBST(root.left, min, root) && isVaildBST(root.right, root, max);
    }
    public static void main(String[] args) {
        int value[] = { 8,5,3,6,10,11,14};
        Node root = null;

        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }

        if (isVaildBST(root, null, null)) {
            System.out.println("Valid BST");
        } else {
            System.out.println("Invalid BST");
        }

    }
}

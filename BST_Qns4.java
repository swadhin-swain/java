// sorted array to valid BST

public class BST_Qns4 {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // function for inorder traversal
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static Node createBST(int[] arr, int start, int end) {
        if (start > end) { // base case
            return null;
        }

        int mid = (start + end)/2;

        Node root = new Node(arr[mid]);
        root.left = createBST(arr, start, mid - 1);
        root.right = createBST(arr, mid + 1, end);

        return root;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,6,8,10,11,12};

         /*
                 8
                / \
               5   11
              / \  /\
             3   6 10 12
             expected BST
        */

        Node root = createBST(arr, 0, arr.length - 1);

        inOrder(root);
    }
}

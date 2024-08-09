// check the subtree of a tree

public class Binary_tree_Qns5 {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isSubtree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdenical(root, subRoot)) {
                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    // helper function
    public static boolean isIdenical(Node root, Node subRoot) {
        if (root == null && subRoot == null) {
            return true;
        } else if (root == null || subRoot == null || root.data != subRoot.data) {
            return false;
        }

        if (!isIdenical(root.left, subRoot.left)) {// check the left part is correct
            return false;
        }

        if (!isIdenical(root.right, subRoot.right)) { // check the right part is correct
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
              /*
                   1
                  / \
                 2   3
                / \ / \
               4   56  7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /*
                 2   
                / \ 
               4   5
         */

         Node subRoot = new Node(2);
         subRoot.left = new Node(4);
         subRoot.right = new Node(5);

         System.out.println(isSubtree(root, subRoot));
    }
}

// print Kth level of a tree
import java.util.*;

public class Binary_Trees_Qns7 {
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

    // iterative approach
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int level = 1;

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                     q.add(null);
                     level++;
                }
            } else {
                if (level == 3) {
                    System.out.print(currNode.data + " ");
                }
                
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    // recursive approach
    public static void KthLevel(Node root, int level, int k) {
        if (root == null) { // base case
            return;
        }

        if(level == k) {
            System.out.print(root.data+" ");
            return;
        }

        KthLevel(root.left, level + 1, k);
        KthLevel(root.right, level + 1, k);
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

        levelOrder(root);

        int k = 3;
        KthLevel(root, 1, k);
    }
}

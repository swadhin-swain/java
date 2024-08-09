
// delete the leaf node with valuex
import java.util.*;

public class Binary_Tree_Qns12 {
    static class Node {
        int data;
        Node left;
        Node right;
    }

    static Node newNode(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.left = null;
        newNode.right = null;
        return (newNode);
        }

    public static Node deleteLeave(Node root, int x) {
        if (root == null) {
            return null;
        }

        root.left = deleteLeave(root.left, x);
        root.right = deleteLeave(root.right, x);

        if (root.data == x && root.left == null && root.right == null) {
            return null;
        }

        return root;
    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        Node root = newNode(10);
        root.left = newNode(3);
        root.right = newNode(10);
        root.left.left = newNode(3);
        root.left.right = newNode(1);
        root.right.right = newNode(3);
        root.right.right.left = newNode(3);
        root.right.right.right = newNode(3);

        int x = 3;

        deleteLeave(root, x);
        levelOrder(root);

    }
}

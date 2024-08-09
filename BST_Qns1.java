// root to leaf paths

import java.util.ArrayList;

public class BST_Qns1 {
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

    // function for printing root to leaf paths
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
        //base case
        if (root == null) {
            return;
        }

        path.add(root.data);

        if (root.left == null && root.right == null) { // leaf nodes are occurs so print the path
            printPath(path);
        }

        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size() - 1);
    }

    // helper function
    public static void printPath(ArrayList<Integer> path) {
        for(int i=0;i<path.size();i++) {
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        int value[] = { 8,5,3,6,10,11,14};
        Node root = null;

        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }

        printRoot2Leaf(root, new ArrayList<>());
    }
}

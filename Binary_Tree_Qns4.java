// find the diameter of a binary tree

public class Binary_Tree_Qns4 {
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

     // function for calculating height
     public static int height(Node root){
        if(root== null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight =height(root.right);
        return Math.max(leftHeight, rightHeight)+1;
    }

    // function for finding the diameter
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }

        int leftDiam = diameter(root.left);
        int leftHeight = height(root.left);
        int rightDiam = diameter(root.right);
        int rightHeight = height(root.right);

        int selfDiam = leftHeight + rightHeight + 1;

        return Math.max(selfDiam, Math.max(rightDiam, leftDiam));
    }

    // better approach
    static class Info{
        int diam;
        int height;
        public Info(int diam, int height) {
            this.diam = diam;
            this.height = height;
        }
    }
    public static Info diameter2(Node root){
        if(root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.height+rightInfo.height+1);
        int height = Math.max(leftInfo.height, rightInfo.height)+1;

        return new Info(diam, height);
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

        System.out.println(diameter(root));

        System.out.println(diameter2(root).diam);
    }
}

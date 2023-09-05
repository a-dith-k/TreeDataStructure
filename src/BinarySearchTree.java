public class BinarySearchTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (root.data > data) {
            //left subtree
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }


    public void inserter(Node root,int data){
        if(root==null){
            root=new Node(data);
        }
        if(root.data>data){
            inserter(root.left,data);
        }else{
            inserter(root.right,data);
        }
    }

    public static boolean contains(Node root, int data) {
        if (root == null) {
            return false;
        } else if (root.data > data) {
            return contains(root.left, data);
        } else if (root.data == data) {
            return true;
        } else {
            return contains(root.right, data);
        }


    }


    public static void main(String[] args) {

        int[] nodes = {1, 5, 7, 8, 2, 9, 3};
        Node root = null;

        for (int i = 0; i < nodes.length; i++) {
            root = insert(root, nodes[i]);
        }

        inorder(root);
        System.out.println(contains(root, 23));
    }
}

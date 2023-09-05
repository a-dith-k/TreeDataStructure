import java.sql.SQLOutput;
import java.util.Queue;
import java.util.LinkedList;

public class BinaryTrees {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static class BinaryTree {

        int index = -1;

        public Node buildTree(int[] nodes) {
            index++;

            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        }

        public void preorderTraversal(Node root) {
            if (root == null) {
                return;
            }
            System.out.println(root.data);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }

        public void inorderTraversal(Node root) {

            if (root == null) {
                return;
            }
            inorderTraversal(root.left);
            System.out.println(root.data);
            inorderTraversal(root.right);
        }

        public void postorderTraversal(Node root) {

            if (root == null) {
                return;
            }

            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.println(root.data);
        }

        public void levelOrderTraversal(Node root) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currentNode = q.remove();
                if (currentNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currentNode.data + " ");
                    if (currentNode.left != null) {
                        q.add(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        q.add(currentNode.right);
                    }
                }
            }
        }

        public int countNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftSubTree = countNodes(root.left);
            int rightSubTree = countNodes(root.right);

            return leftSubTree + rightSubTree + 1;

        }

        public int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }

            int leftSubtree = sumOfNodes(root.left);
            int rightSubtree = sumOfNodes(root.right);

            return leftSubtree + rightSubtree + root.data;


        }

        public int height(Node root) {
            if (root == null) {
                return 0;
            }

            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public static void main(String[] args) {

        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
//        System.out.println(root.data);
//        tree.preorderTraversal(root);
//        tree.inorderTraversal(root);
//        tree.postorderTraversal(root);
        System.out.println(tree.countNodes(root));
        System.out.println(tree.sumOfNodes(root));
        System.out.println(tree.height(root));
    }
}

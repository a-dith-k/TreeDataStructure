public class BSTreee {
    public static class Node {

        int data;
        BinaryTrees.Node left;
        BinaryTrees.Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public BST.Node insert(BST.Node root, int data){
        if(root==null){
            root=new BST.Node(data);
            return root;
        }
        if(data<root.data){
            root.left=insert(root.left,data);
        }else{
            root.right=insert(root.right,data);
        }
        return root;
    }

    public static void main(String[] args){
        BSTreee tr=new BSTreee();
        tr.insert(12);

    }


}

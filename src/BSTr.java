public class BSTr {

     static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
    Node root=null;

    public void insert(int data){
         Node temp=root;
         if(temp==null){
             root=new Node(data);
             return;
         }
         while(true){
             if(data<temp.data){
                 if (temp.left == null) {
                     temp.left=new Node(data);
                     return;
                 }else{
                     temp=temp.left;
                 }
             }else{
                 if(temp.right==null){
                     temp.right=new Node(data);
                     return;
                 }else{
                     temp=temp.right;
                 }
             }
         }
    }

    public boolean isPrime(int data){

        for(int i=2; i<=data/2; i++){
            if(data%i==0){
                return false;
            }
        }
        return true;
    }

     public void inorder(){
        inorder(root);
     }

    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            if(isPrime(root.data)){
                System.out.println(root.data);
            }
            inorder(root.right);
        }

    }

    public static void main(String[] args){

        BSTr tr=new BSTr();
        tr.insert(17);
        tr.insert(25);
        tr.insert(27);
        tr.insert(12);
        tr.inorder();
    }


}

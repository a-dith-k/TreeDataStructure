//public class BSTree {
//
//    static class Node{
//
//        int data;
//        Node left;
//        Node right;
//
//        Node(int data){
//            this.data=data;
//        }
//    }
//
//    Node root;
//
//    BSTree(){
//        root=null;
//    }
//
//    public void insert(int data){
//        Node currentNode=root;
//        if (currentNode == null) {
//            root=new Node(data);
//            return;
//        }
//        while(true){
//            if(data<currentNode.data){
//                if(currentNode.left==null){
//                    currentNode.left=new Node(data);
//                    break;
//                }else{
//                    currentNode=currentNode.left;
//                }
//
//            }else{
//                if(currentNode.right==null){
//                    currentNode.right=new Node(data);
//                    break;
//                }else{
//                    currentNode=currentNode.right;
//                }
//
//            }
//        }
//    }
//
//    public void  remove(int data){
//
//    }
//
//    public boolean contains(int data){
//        Node currentNode=root;
//        if(currentNode.data==data){
//            return true;
//        }
//        if(data<currentNode.data){
//            if(currentNode.left.data==data){
//                return true;
//            }
//        }
//
//
//    }
//}

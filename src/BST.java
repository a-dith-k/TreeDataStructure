public class BST {
    Node root;

    BST(){
        root=null;
    }

    BST(int data){
        root=new Node(data);
    }

    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }

    public void insert(int data){
        root=insert(root,data);
    }
    //-------method to insert a node in tree recursive approach
    public  Node insert(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        if(data<root.data){
            root.left=insert(root.left,data);
        }else{
            root.right=insert(root.right,data);
        }
        return root;
    }

    //--iterative approach
    public void insertIter(int data){
        Node currentNode=root;
        if(currentNode==null){
            root=new Node(data);
            return;
        }
        while(true){
            if(data<currentNode.data){
                if(currentNode.left==null){
                    currentNode.left=new Node(data);
                    break;
                }else{
                    currentNode=currentNode.left;
                }
            }else if(data>currentNode.data){
                if(currentNode.right==null){
                    currentNode.right=new Node(data);
                    break;
                }else{
                    currentNode=currentNode.right;
                }
            }
        }

    }

    //----method to delete a node from tree iterative approach
    public void delete(int data,Node currentNode,Node parent){
        while(currentNode!=null){
            if(data<currentNode.data){
                parent=currentNode;
                currentNode=currentNode.left;
            }else if(data>currentNode.data){
                parent=currentNode;
                currentNode=currentNode.right;
            }else{
                if(currentNode.left==null&&currentNode.right==null){
                      if(parent.left==currentNode){
                          parent.left=null;
                          break;
                      }else if(parent.right==currentNode){
                          parent.right=null;
                          break;
                      }else{
                         root=null;
                         break;
                      }
                }else if(currentNode.right==null){
                    currentNode.data=rightMostOfLeft(currentNode.left);
                    delete(currentNode.data,currentNode.left,currentNode);
                }else{
                     currentNode.data=leftMostOfRight(currentNode.right);
                     delete(currentNode.data,currentNode.right,currentNode);
                }
            }
        }

    }

    private int rightMostOfLeft(Node left){
        while(left.right!=null){
            left=left.right;
        }
        return left.data;
    }
    private int leftMostOfRight(Node right){
        while(right.left!=null){
            right=right.left;
        }
        return right.data;
    }


    //-----------inorder traversal -recursive
    public void inorder(){
        inorder(root);
    }

    public void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    //--preorder traversal

    public void preorder(){
        preorder(root);
    }
      public void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
      }

      //--postorder traversal
    public void postorder(){
        postorder(root);
    }
    public void postorder(Node root){
        if(root==null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }

    public boolean contains(int data){
        Node currentNode=root;
        while(true){
            if(currentNode==null){
                return false;
            }
            if(data<currentNode.data){
                currentNode=currentNode.left;
            }else if(data>currentNode.data){
                currentNode=currentNode.right;
            }else{
                return true;
            }
        }

    }


    public static void main(String [] ar){


        BST tree=new BST();

//        tree.insert(23);
//        tree.insert(24);
//        tree.insert(15);
        tree.insertIter(12);
        tree.insertIter(8);
        tree.insertIter(92);
        tree.insertIter(10);
        System.out.println(tree.contains(1));

        tree.inorder();
//        tree.preorder();
//        tree.postorder();



    }

}

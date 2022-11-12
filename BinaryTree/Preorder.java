package BinaryTree;

import com.sun.source.tree.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Preorder {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    static class BinarTree{
        static int index = -1;
        public static Node buildtree(int[] nodes){
            index++;
            if(nodes[index]== -1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);

            return newNode;

        }
        static void ptraverse(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            ptraverse(root.left);
            ptraverse(root.right);
        }
        static void leveorder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()){
                Node cur = q.remove();
                if(cur==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                } else {
                    System.out.print(cur.data+" ");
                    if(cur.left!=null){
                        q.add(cur.left);
                    }
                    if (cur.right!=null){
                        q.add(cur.right);
                    }
                }
            }
        }
        static boolean serchintree(Node root,int key){
            if(root==null){
                return false;
            }
            if(root.data==key){
                return true;
            }
            if(key>root.data){
               return serchintree(root.right,key);
            }else
                return serchintree(root.left,key);
        }
        public static int countnode(Node root){
            if(root==null){
                return 0;
            }
            int leftnode = countnode(root.left);
            int rightnode = countnode(root.right);
            return leftnode+rightnode+1;
        }
    }
    public static void main(String[] args) {
        int[] nodes = {100,50,10,-1,-1,60,-1,-1,200,150,-1,-1,300,-1,-1};
        BinarTree tre = new BinarTree();
        Node root = tre.buildtree(nodes);
        System.out.println(root);
        BinarTree.ptraverse(root);
        BinarTree.leveorder(root);
        System.out.println(BinarTree.serchintree(root,300));
        System.out.println(BinarTree.countnode(root));
//        tree.traverse
    }
}

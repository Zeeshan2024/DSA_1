package BinaryTree;

import com.sun.source.tree.BinaryTree;

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
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinarTree tree = new BinarTree();
        Node root = tree.buildtree(nodes);
        System.out.println(root);
    }
}

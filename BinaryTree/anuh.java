package BinaryTree;

import java.util.Scanner;

public class anuh {
    static Scanner sc = new Scanner(System.in);
    class node {
        node left, right;
        int data;
        node(int data){
            this.data = data;
        }
    }
     node createtree(){
        node root = null;
         System.out.println("Enter data:");
        int data = sc.nextInt();
         if(data==-1) return null;
        root = new node(data);
         System.out.println("Enter data for left : "+ data);
         root.left = createtree();
         System.out.println("Enter data for right : " + data);
         root.right = createtree();

         return root;
    }
    public static void main(String[] args) {
        anuh tree = new anuh();
        node root = tree.createtree();
        System.out.println(root);

    }
}

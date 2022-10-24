//package linkd_list.co;
//
//public class Insert {
//    private static void main(String[] args) {
//        Node n1 = new Node(10);
//        Node n2 = new Node(20);
//        Node n3 = new Node(30);
//
//        Node head = n1;
//        n1.next = n2;
//        n2.next = n3;
//        n3.next = null;
//
////
//      prit(head);
//
//
//    }
//
//    static class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//        }
//
//    }
//
//    private static void prit(Node head){
//        Node cur = head;
//        int cnt = 0;
//        while (cur!=null){
//            System.out.println(cur.data);
//            cur = cur.next;
//            cnt++;
//            System.out.println(cur);
//
//        }  System.out.println("count = " + cnt);
//    }
//}
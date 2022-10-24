//package linkd_list.co;
//
//public class collection {
//    public static void main(String[] args) {
//        Node n1 = new Node(10);
//        Node n2 = new Node(20);
//        Node n3 = new Node(30);
//
//        Node head = n1;
//        n1.next = n2;
//        n2.next = n3;
//        n3.next = null;
////    insert(2,head);
//    print(head);
//
//    }
//     static class  Node{
//        int val;
//        Node next;
//
//        Node( int data){
//           this.val = data;
//        }
//    }
//   static void insert(int data, Node head) {
//        if (head == null) {
//            Node toadd = new Node(data);
//            head = toadd;
//
//        } else {
//            Node toadd = new Node(data);
//            toadd.next = head;
//            head = toadd;
//        }
//    }
//  static void print(Node head){
//        Node cur = head;
//        while(cur!=null){
//            System.out.println(cur.val);
//            cur = head.next;
//        }
//    }
//    }

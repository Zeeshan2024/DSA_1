package linkd_list.co;

public class addFirst {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("Zeeshan");
        list.addFirst("Fatima");
        list.addLast("Mirza");
        list.addLast("Suboor");
        list.addLast("amaan");
        list.deleteMid(2);
        list.print();

//        list.print();
//        System.out.println("---------------After deletion of first element------------");
//        list.deleteFirst();
//        list.print();
//        list.deletelast();
//        System.out.println("---------------After deletion of last element------------");
//        list.print();

    }
//                   TODO ----------------Implement LL class and Node----------------
    static class LL{
        Node head;
        class Node{
            String data;
            Node next;

            Node (String data){
                this.data = data;
                this.next = null;
            }
        }
//       TODO creating a funtion to Add value at first pos

    void addFirst(String str){
        Node first = new Node(str);
        if(head==null){
            head = first;
            return;
        }else{
            first.next = head;
            head = first;
        }
    }
//    TODO: Add at Last
    void addLast(String str){
            Node last = new Node(str);
            if(head==null){
                head = last;
                return;
            }else{
                Node cur = head;
                while (cur.next!=null){
                    cur = cur.next;
                } cur.next = last;
            }
    }
    void print(){
            if(head==null){
                System.out.println("List is Empty");
            }
            Node cur = head;
            while(cur!=null){
                System.out.println(cur.data);
                cur = cur.next;
        }
        System.out.println("NULL");
    }

    void deleteFirst(){
            if(head==null){
                System.out.println("Lisy is Empty");
                return;
            }
            head = head.next;
    }
    void deletelast(){
            if(head==null){
                System.out.println("list is empty");
                return;
            }
            if(head.next==null){
                head = null;
                return;
            }
            Node last = head.next;
            Node Secondlast = head;
            while(last.next!=null){
                last = last.next;
                Secondlast = Secondlast.next;
            } Secondlast.next = null;
    }
    void deleteMid(int pos){
            Node prev = head;
            for(int i=0;i<pos-1;i++){ //pos = 2
                prev = prev.next;
            } prev.next = prev.next.next;
    }

    }
}

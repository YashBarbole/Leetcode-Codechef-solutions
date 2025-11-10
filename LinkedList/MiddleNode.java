package LinkedList;

public class MiddleNode extends LL {
    public static void main(String[] args) {
        LL list1=new LL();
        list1.insertFirst(2);
        list1.insertFirst(3);
        list1.insertFirst(4);
        list1.insertFirst(5);
        list1.insertFirst(6);

        Node mid=MiddleNode(list1.head);
        System.out.println(mid.value);
    }

    public static  Node MiddleNode(Node head){
           if(head==null)return null;

           Node slow=head;
           Node fast=head;

           while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
           }
           return slow;
}
}

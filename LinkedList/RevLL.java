package LinkedList;

public class RevLL {
    public class Node{
        int val;
        Node next;

        public Node(){
            this.val=0;
            this.next=null;
        }
        public Node(int val){
            this.val=val;
            this.next=null;
        }
    };
    
    
    public static Node RevSLL(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}

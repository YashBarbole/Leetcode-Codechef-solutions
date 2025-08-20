package LinkedList;

public class NthNodeFromLast {

    private class Node{
    private int value;
    private Node next;

        public Node(int value){
        this.value=value;
        }  
        public Node(int value, Node next){
        this.value=value;
        this.next=next;
        }
    }

    public Node removeNthFromEnd(Node head, int n){
        if(head.next==null){
            return null;
        }

        //size
        int size=0;
        Node curr=head;
        while(curr!=null){
            curr=curr.next;
            size++;
        }

        if(n==size){
            return head.next;
        }
        int IndexToSearch= size-n;
        Node prev=head;
        int i=1;
        while(i<IndexToSearch){
            prev=prev.next;
            i++;
        }

        prev.next=prev.next.next;
        return head;
    }
}

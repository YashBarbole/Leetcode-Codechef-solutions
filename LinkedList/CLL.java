package LinkedList;

public class CLL {
    private Node head;
    private Node tail;

    private CLL(){
        this.head=null;
        this.tail=null;
    }

    private class Node{
        int val;
        Node next;

        public Node(int val){
                this.val=val;
        }
    }
    

    public void InsertAfterLast(int val){
        Node node= new Node(val);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }

    public void PrintCLL(){
        Node node=head;
        if(head!=node){
            do{
                System.out.println(node.val+"->");
                node=node.next;
            }
            while(node!=head);
        }
    }
}

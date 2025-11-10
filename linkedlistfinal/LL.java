package linkedlistfinal;

public class LL {
    
    public Node head;
    public Node tail;
    public int size;


    public class Node{
        int val;
        Node next;

        Node(int val){
            this.val=val;
            this.next=null;
        }
        Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
    }

    public void InsertFirst(int val){
        Node node= new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void InsertLast(int val){
    if(tail==null){
        InsertFirst(val);
        return;
    }
    Node node= new Node(val);
    tail.next= node;
    tail=node;
    size++;
}

    public void InsertAtPos(int val,int index){
            if(index==0){
                 InsertFirst(val);
                 return;
                }
        
            if(index==size){
                InsertLast(val);
                return;
            }

            
    
    

}
    }
        
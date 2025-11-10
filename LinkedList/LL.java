package LinkedList;

public class LL {

public Node head;
public Node tail;
public int size;
public LL(){
    this.size=0;
}
public static class Node{
     int value;
     Node next;

        public Node(int value){
        this.value=value;
        }  
        public Node(int value, Node next){
        this.value=value;
        this.next=next;
        }
    }
 



//inserrt first
public void insertFirst(int val){
    Node node= new Node(val);
    node.next= head;
    head=node;
    if(tail==null){
        tail=head;
    }
    size+=1;
}


//print LL
public void Print(){
    Node temp= head;
    while(temp!= null){
        System.out.print(temp.value+"->");
        temp=temp.next;
    }
    System.out.println("END");
}

//insert at last
public void InsertLast(int val){
    if(tail==null){
        insertFirst(val);
        return;
    }
    Node node= new Node(val);
    tail.next= node;
    tail=node;
    size++;
}

//insert at index
public void InsertAtIndex(int val,int index){
    if(index==0){
        insertFirst(val);
        return;
    }
    if(index==size){
        InsertLast(val);
        return;
    }
    Node temp= head;
    for(int i=1;i<index;i++){
        temp=temp.next;
    }
    Node node= new Node(val,temp.next);
    temp.next=node;
    size++;
}

//delete first
public int DeleteFirst(){
int value= head.value;
head=head.next;
if(head==null){
    tail=null;
}
size--;
return value;
}


//value of node
public Node gett(int index){
Node node= head;
for(int i=0;i<index;i++){
    node=node.next;
}
return node;
}

//delete tail
public int DeleteTail(){
    if(size<=1){
        return DeleteFirst();
    }
    Node secondlast=gett(size-2);//second last will point to second last element 
    int value=tail.value;
    tail=secondlast;
    tail.next=null;
    return value;
}

//delete index
public int DeleteIndex(int index){
    if(index==0){
        return DeleteFirst();
    }
    if(index==size-1){
        DeleteTail();
    }

    Node prev= gett(index-1);
    int value= prev.next.value;
    prev.next=prev.next.next;
    return value;

}

//find value
public Node find (int value){
    Node node= head;
    while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
    }
    return null;
}
//reverse LL
public  Node RevSLL(Node head){
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
//find middle
    public Node FindMiddle(Node head){
            Node slow=head;
            Node fast=head;

            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
    }
//cycle

         public boolean hasCycle(Node head) {
    Node slow=head;
    Node fast=head;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

}

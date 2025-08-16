package LinkedList;

public class DLL {

    private class Node{
    int val;
    Node next;
    Node prev;

    public Node(int val){
        this.val=val;
    }
}
//insert first
private Node head;

public void insertFirst(int val){
    Node node = new Node(val);
    node.next=head;
    node.prev=null;
    if(head!=null){
        head.prev=node;
    }
    head= node;
}


//pritn DLL
public void PrintDLL(){
    Node node= head;
    while(node!=null){
        System.out.print(node.val+"->");
        node=node.next;
    }
    System.out.println("end");
}

//print reverse
public void PrintDLLrev(){
    Node node= head;
    Node last= null;
    while(node!=null){
        System.out.print(node.val+"->");
        last=node;
        node=node.next;
    }
    System.out.println("end");
    System.out.println("reversed :");
    while(last!=null){
            System.out.print(last.val+"->");
            last=last.prev;
    }
    System.out.println("start");
}

//insertlast
//start from the head next is null

//when reached last 
public void Insertlast(int val){
    Node node= new Node(val);
    Node last = head;

    node.next=null;

        if(head==null){
        node.prev=null;
        head=node;
        return;
        }

        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;


}
//findnodeval
public Node find (int value){
    Node node= head;
    while(node!=null){
            if(node.val==value){
                return node;
            }
            node=node.next;
    }
    return null;
}


//insert at index 
public void InsertAfterValue (int after,int val){
        Node p=find( after);
        if(p==null){
            System.out.println("not exist");
        }
        Node node = new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;    
        if(node.next!=null){
             node.next.prev=node;
        }
       

}


 


















}

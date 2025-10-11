package LL_revise;

import java.util.Stack;

public class REV_DLL {
    public class Node{
    int val;
    Node next;
    Node prev;
    public Node(int val){
        this.val=val;
    }
    
}
public Node head;

public void Swap(Node current){
  Node last=current.prev;
  current.prev=current.next;
  current.next=last;
}

public void insertFirst(int val){
    Node node = new Node(val);
    node.next=head;
    node.prev=null;
    if(head!=null){
        head.prev=node;
    }
    head= node;
}

public void PrintDLL(){
    Node node= head;
    while(node!=null){
        System.out.print(node.val+"->");
        node=node.next;
    }
    System.out.println("end");
}
    public static void main(String[] args) {
         
        REV_DLL list2 = new REV_DLL();
        list2.insertFirst(3);
        list2.insertFirst(2);
        list2.insertFirst(8);
        list2.insertFirst(17);   
        list2.PrintDLL();

        list2.head=REV_DLLL(list2.head);

        list2.PrintDLL();

    }

    public static Node REV_DLLL(Node head){//bruteforce
        Stack<Integer> st=new Stack<>();
        Node temp=head;

        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        while (temp!=null) {
            temp.val=st.peek();
            st.pop();
            temp=temp.next;
        }
        return head;

    }

    public Node REV_DLL_LINKS(Node head){//swapping next and back
            if(head==null|| head.next==null){
                return head;

            }
          Node temp= null;
          Node curr= head;
          while(curr!=null){
            temp=curr.prev;
            curr.prev=curr.next;
            curr.next=temp;

            curr=curr.prev;
          }
          return temp.prev;


    }
    
}

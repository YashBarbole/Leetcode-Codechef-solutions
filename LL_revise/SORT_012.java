package LL_revise;

public class SORT_012 {

    public class Node{
    int val;
    Node next;
    Node prev;
    public Node(int val){
        this.val=val;
    } 
   
    }
    public Node head;

    //insert 
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
        SORT_012 list = new SORT_012();
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(0);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(0);

        System.out.println("Before sorting:");
        list.PrintDLL();

        list.SORT(list.head);

        System.out.println("After sorting:");
        list.PrintDLL();
    }

    public void SORT(Node head){//2pass soln
        Node temp=head;
        int cnt0=0,cnt1=0,cnt2=0;
        while(temp!=null){
            if(temp.val==0)cnt0++;
            else if(temp.val==1)cnt1++;
            else cnt2++;
            temp=temp.next;
        }

        temp=head;
        while(temp!=null){
            if(cnt0>0){
                    temp.val=0;
                    cnt0--;
            }
            else if(cnt1>0){
                temp.val=1;
                cnt1--;
            }
            else{
                temp.val=2;
                cnt2--;
            }
            temp=temp.next;
        }
        

    }

    public void SORT_LINKS_CHANGE(Node head){
        
    }
    
}

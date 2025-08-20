package LinkedList;

import corejava.rev;

public class Main {
    public static void main(String[] args) {
        System.out.println("SINGLE LL");
       LL list = new LL();
       list.insertFirst(3);
       list.insertFirst(2);
       list.insertFirst(8);
       list.insertFirst(17);   
       list.InsertAtIndex(20,2 ); 
        list.Print();
    
        list.head = list.RevSLL(list.head); 
        list.Print();

     
System.out.println();
System.out.println("DOUBLE LL");

System.out.println(list.hasCycle(list.head));
        
        DLL list2 = new DLL();
        list2.insertFirst(3);
        list2.insertFirst(2);
        list2.insertFirst(8);
        list2.insertFirst(17);   
       
      list2.PrintDLL();
      list2.head=list2.RevDLL(list2.head);
      list2.PrintDLL();

      System.out.println();
    LL.Node mid = list.FindMiddle(list.head);
      System.out.println(mid.value);
        
        
    }
}

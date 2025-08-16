package LinkedList;

public class Main {
    public static void main(String[] args) {
    //    LL list = new LL();
    //    list.insertFirst(3);
    //    list.insertFirst(2);
    //    list.insertFirst(8);
    //    list.insertFirst(17);   
    //    list.InsertAtIndex(20,2 ); 

       
  

    // list.Print();
    // System.out.println(list.DeleteFirst());
    // list.Print();
    // System.out.println(list.DeleteTail());
    // list.Print();
    // System.out.println(list.DeleteIndex(2));
    // list.Print();
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);   
       
        // list.PrintDLLrev();
        list.Insertlast(99);
        list.InsertAfterValue(8,66 );
        list.PrintDLL();
   
    }
}

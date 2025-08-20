// package LinkedList;

// public class MiddleNode extends LL {
//     public static void main(String[] args) {
//         LL list1=new LL();
//         list1.insertFirst(2);
//         list1.insertFirst(3);
//         list1.insertFirst(4);
//         list1.insertFirst(5);
//         list1.insertFirst(6);

//         Node mid=FindMiddle(list1.head);
//         System.out.println(mid.value);
//     }

//     public static Node FindMiddle(Node head){
//             Node temp=head;
//             int cnt=0;
//             while(temp!=null){
//                 cnt++;
//                 temp=temp.next;
//             }
//             int midNode=(cnt/2)+1;
//             temp=head;
//             while(temp!=null){
//                 midNode=midNode-1;
//                 if(midNode==0){
//                     break;
//                 }
//                 temp=temp.next;
//             }
//             return temp;
//     }
// }

package LinkedList;

import java.util.Stack;

public class PalindromeLL extends LL{
   public static void main(String[] args) {
    LL l1=new LL();
    l1.insertFirst(2);
    l1.insertFirst(1);
    l1.insertFirst(2);

    System.out.println(CheckPalindrome(l1));
   } 

   public static Boolean CheckPalindrome(LL l1){
        Node temp=l1.head;
        Stack<Integer> stack=new Stack<>();

        while(temp!=null){
            stack.push(temp.value);
            temp=temp.next;
        }

        temp=l1.head;
        while(temp!=null){
            if(temp.value!=stack.pop()){return false;}
                temp=temp.next;
              
            
        }
        return true;

        
   }




}

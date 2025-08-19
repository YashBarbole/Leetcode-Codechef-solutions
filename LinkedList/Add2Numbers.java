package LinkedList;

public class Add2Numbers {

    public static void main(String[] args) {
        LL list1 = new LL();
        LL list2 = new LL();

        
        list1.InsertLast(2);
        list1.InsertLast(4);
        list1.InsertLast(3);

        
        list2.InsertLast(5);
        list2.InsertLast(6);
        list2.InsertLast(4);

        LL result = new LL();
        result.head = addNumbers(list1.head, list2.head);

        System.out.println("List1: ");
        list1.Print();
        System.out.println("List2: ");
        list2.Print();
        System.out.println("Result: ");
        result.Print();  
    }

    // Function to add two numbers
    public static LL.Node addNumbers(LL.Node l1, LL.Node l2) {
        LL dummyList = new LL();  //  access Node class
        LL.Node dummy = dummyList.new Node(0);
        LL.Node curr = dummy;

        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.value;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.value;
                l2 = l2.next;
            }

            carry = sum / 10;
            curr.next = dummyList.new Node(sum % 10);
            curr = curr.next;
        }
        return dummy.next;  // skip dummy
    }
}

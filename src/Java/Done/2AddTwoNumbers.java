//Correct
//Speed: beats 99.75%
//Memory: beats 65.93%
class AddTwoNumbers {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode returnValue = new ListNode();
        ListNode current = returnValue;
        int carry = 0;
        while(l1 != null || l2 != null){
            int temp1 = 0;
            int temp2 = 0;
            if(l1 != null){
                temp1 = l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                temp2 = l2.val;
                l2 = l2.next;
            }
            int temp = temp1 + temp2 + carry;
            if(temp > 9){
                temp = temp - 10;
                carry = 1;
            }
            else{
                carry = 0;
            }
            current.val = temp;
            if(l1 != null || l2 != null){
                current.next = new ListNode();
                current = current.next;
            }
            else if(carry == 1){
                current.next = new ListNode(1);
            }
        }
        return returnValue;
    }


}


// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode swapPairs(ListNode head) {

        ListNode current = head;

        if(current == null){
            return head;
        }
        
        while(current != null){
            if(current.next == null){
                break;
            }
            //confirmed there are two more nodes in the list
            ListNode first = current;
            ListNode second = current.next;

            //add the rest of the list to what is currently the first of the two
            first.next = second.next;
            //set the one after second to be what was the first one
            second.next = first;
            //set current to what was the second one
            current = second;
            //current is now equal to whatever was after what we called first

            //-------------is breaking, a print here shows that it has the correct values in current and current.next, just isn't saving them right

            current = current.next.next;
        }



        return head;

    }
}
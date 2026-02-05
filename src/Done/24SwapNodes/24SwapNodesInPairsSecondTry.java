//Correct
//Speed: Beats 100%
//Memory: Beats 61.48%
//Needed help from solutions

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

        
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode previous = dummy;
        
        while(previous.next != null){
            if(previous.next.next == null){
                break;
            }
            //confirmed there are two more nodes in the list
            ListNode first = previous.next;
            ListNode second = previous.next.next;
            

            //add the rest of the list to what is currently the first of the two
            first.next = second.next;
            //set the one after second to be what was the first one
            second.next = first;
            //set current to what was the second one
            previous.next = second;
            
            //current is now equal to whatever was after what we called first
            System.out.println(previous.next.val + "," + previous.next.next.val);

            previous = first;
        }



        return head;

    }
}
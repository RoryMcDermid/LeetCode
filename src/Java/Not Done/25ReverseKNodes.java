

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode previous = dummy;
        ListNode working = dummy;
        

        ListNode[] currentNodes = new ListNode[k];

        int current = k - 1;

        //while true
        //make array of listnodes of k length and fill from end?
        while(previous.next != null){
            //add to current nodes?
            //then if at the start of current nodes add to end of head?
            currentNodes[current] = previous.next;

            current--;

            if(current == 0){

                for(int i = 0; i < currentNodes.length; i++){
                    working.next = currentNodes[i];
                    working = working.next;
                }

                current = k - 1;
            }

            previous = previous.next;
        }
        return head;
    }
}
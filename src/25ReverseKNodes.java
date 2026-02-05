

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
        

        ListNode[] currentNodes = new ListNode[k];

        //while true
        //make array of listnodes of k length and fill from end?
        boolean working = true;
        while (working) { 
            ListNode current = previous.next;
            for(int i = k-1; i > 0; i--){
                if(current != null){
                    currentNodes[i] = current;
                    current = current.next;
                }
                else{
                    working = false;
                    break;
                }
            }
            if(working == false){
                break;
            }
            for(int i = 0; i < k; i++){
                System.out.println(currentNodes[i].val);
                previous.next = currentNodes[i];
                previous = previous.next;
            }
        }
        return head;
    }
}
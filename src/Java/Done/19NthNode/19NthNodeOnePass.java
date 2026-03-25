//Correct (needed some support from solution as my answer was overcomplicated and didn't work, try visualising next time)
//Speed: Beats 100%
//Memory: Beats 48.67%


//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

//[1][2][3][4][5]

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       //to remove nth from the end, store the "current" node and a node 'n'+1 back from that, once I hit the end then I can remove the node at n

        ListNode fast = head;
        ListNode slow = null;

        int diff = 0;

        //while the fast head isn't off the end of the list
        while(fast != null){
            if(diff < n){
                fast = fast.next;
                diff++;
            }
            else{
                if(slow == null){
                    slow = head;
                }
                else{
                    slow = slow.next;
                }
                fast = fast.next;
            }
        }

        if(slow == null){
            return head.next;
        }

        slow.next = slow.next.next;


        return head;
        


    }
}
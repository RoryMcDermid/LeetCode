//Correct
//Speed: Beats 1.48%
//Memory: Beats 13.38%


//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
        int length = 1;

        ListNode nextNode = head;

        while(nextNode.next != null){
            nextNode = nextNode.next;
            length++;
        }

        System.out.println(length);

        nextNode = head;

        if(n == length){
            return head.next;
        }

        for(int i = 0; i < length - n - 1; i++){
            nextNode = nextNode.next;
        }
        if(nextNode.next != null){
            if(nextNode.next.next != null){
                nextNode.next = nextNode.next.next;
            }
            else{
                nextNode.next = null;
            }
        }

        return head;
    }
}
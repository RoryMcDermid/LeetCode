//Correct
//Speed: Beats 100%
//Memory: Beats 79.87%
//REMOVE YOUR PRINTS YOU PILLOCK


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
        ListNode previous = head;

        if(current == null){
            return head;
        }

        boolean firstIteration = true;
        
        while(current != null){
            if(current.next == null){
                break;
            }
            //confirmed there are two more nodes in the list
            ListNode first = current;
            ListNode second = current.next;
            //maybe need a third node after the first iteration? so that the list stays correct.
            

            //add the rest of the list to what is currently the first of the two
            first.next = second.next;
            //set the one after second to be what was the first one
            second.next = first;
            //set current to what was the second one
            current = second;
            if(!firstIteration){
                previous.next = current;
            }

            if(firstIteration){
                head = current;
                firstIteration = false;
            }
            previous = current.next;
            current = current.next.next;
        }



        return head;

    }
}
//Correct (no assistance needed)
//Speed: Beats 100%
//Memory: Beats 48.63%


// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null && list2 == null){
            return list1;
        }

        ListNode returnValue = new ListNode();
        ListNode workingValue = returnValue;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                workingValue.val = list1.val;
                workingValue.next = new ListNode();
                workingValue = workingValue.next;
                list1 = list1.next;
            }
            else{
                workingValue.val = list2.val;
                workingValue.next = new ListNode();
                workingValue = workingValue.next;
                list2 = list2.next;
            }
        }
        if(list1 != null){
            workingValue.val = list1.val;
            workingValue.next = list1.next;
        }
        else if(list2 != null){
            workingValue.val = list2.val;
            workingValue.next = list2.next;
        }

        return returnValue;
        
    }
}
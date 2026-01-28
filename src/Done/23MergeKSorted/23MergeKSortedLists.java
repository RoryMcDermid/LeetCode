//Correct
//Speed: Beats 6.62%
//Memory: Beats 22.26%
//More efficient to merge pairs of lists rather than all at once (see 21 but just expanded out)


// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode returnValue = new ListNode();
        ListNode workingValue = returnValue;

        //while at least one list has a next
        //check which list has the smallest next value, add to workingValue and iterate

        int index = -1;

        do {
            int currentValue = Integer.MAX_VALUE;
            index = -1;
            for(int i = 0; i < lists.length; i++){

                if(lists[i] == null){
                    continue;
                }
                else{

                    if(lists[i].val < currentValue){
                        currentValue = lists[i].val;
                        index = i;
                    }

                    
                    
                }
                
            }

            if(index > -1){
                workingValue.next = new ListNode();
                workingValue = workingValue.next;
                workingValue.val = lists[index].val;
                lists[index] = lists[index].next;
            }

        } while(index > -1);


        return returnValue.next;
    }
}
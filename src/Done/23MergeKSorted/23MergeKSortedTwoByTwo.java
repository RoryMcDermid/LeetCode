//Correct (code was mine, suggestion to combine 2 lists at a time wasn't)
//Speed: Beats 99.66%
//Memory: Beats 10.41%

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
        
        while(lists.length > 1){
            ListNode[] newLists;
            if(lists.length % 2 == 1){
                newLists = new ListNode[lists.length/2 + 1];
                newLists[lists.length/2] = lists[lists.length - 1];
            }
            else{
                newLists = new ListNode[lists.length/2];
            }
            
            for(int i = 0; i < lists.length / 2; i++){
                ListNode listA = lists[i*2];
                ListNode listB = lists[i*2+1];

                ListNode combinedList = new ListNode();
                ListNode workingList = combinedList;

                while(listA != null && listB != null){
                    if(listA.val < listB.val){
                        workingList.next = new ListNode(listA.val);
                        workingList = workingList.next;
                        listA = listA.next;
                    }
                    else{
                        workingList.next = new ListNode(listB.val);
                        workingList = workingList.next;
                        listB = listB.next;
                    }
                }
                if(listA != null){
                    workingList.next = listA;
                }
                if(listB != null){
                    workingList.next = listB;
                }
                newLists[i] = combinedList.next;
            }
            
            lists = newLists;
        }

        if(lists.length == 0){
            return null;
        }



        return lists[0];
    }
}
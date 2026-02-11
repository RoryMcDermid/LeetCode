//Correct
//Speed: Beats 100%
//Memory: Beats 58.83%

class Solution {
    public int removeElement(int[] nums, int val) {
        
        int nonK = 0;
        int shift = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[i-shift] = nums[i];
                nonK++;
            }
            else{
                shift++;
            }
        }

        return nonK;
    }
}
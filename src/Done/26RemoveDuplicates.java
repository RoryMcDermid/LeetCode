//Correct
//Speed: Beats 100%
//Memory: Beats 60.66%

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int uniques = 0;

        //-101 as list will go from -100 to 100
        int last = -101;
        int nextIndex = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == last){
                continue;
            }
            last = nums[i];
            uniques++;
            nums[nextIndex] = nums[i];
            nextIndex++;
        }
        
        return uniques;
    }
}
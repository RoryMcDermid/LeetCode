//Correct
//Speed: Beats 72.04/38% 
//Memory: Beats 39.84%
//Used assistance

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestValue = nums[0] + nums[1] + nums[2];
        
        for(int i = 0; i < nums.length-2; i++){
            int l = i+1;
            int r = nums.length - 1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];

                if(Math.abs(sum - target) < Math.abs(closestValue - target)){
                    closestValue = sum;
                }

                if(sum == target){
                    return sum;
                }
                else if(sum < target){
                    l++;
                }
                else{
                    r--;
                }
            }

        }

        return closestValue;
    }
}
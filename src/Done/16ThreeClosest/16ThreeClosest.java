//Correct
//Speed: Beats 5%
//Memory: Beats 97.64%


class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closestValue = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    if(Math.abs((nums[i] + nums[j] + nums[k]) - target) < Math.abs(closestValue - target)){
                        closestValue = nums[i] + nums[j] + nums[k];
                    }
                }
            }
        }

        return closestValue;
    }
}
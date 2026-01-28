//Correct
//Speed: Beats 43.73%
//Memory: Beats 92.20%

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> returnValue = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 3; i++){

            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            for(int j = i + 1; j < nums.length - 2; j++){

                if(j > i + 1 && nums[j] == nums[j-1]){
                    continue;
                }

                int l = j + 1;
                int r = nums.length - 1;

                while(l < r){
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[r];

                    if(sum == target){
                        returnValue.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));

                        while(l < r && nums[l] == nums[l+1]){
                            l++;
                        }

                        while(l < r && nums[r] == nums[r-1]){
                            r--;
                        }

                        l++;
                        r--;
                    }
                    else if(sum < target){
                        l++;
                    }
                    else{
                        r--;
                    }
                }

            }

        }
        return returnValue;
    }
}
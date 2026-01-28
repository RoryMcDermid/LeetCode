//Correct (needed to look at solutions to figure it all out)
//Speed: Beats 58.81%
//Memory: Beats 41.30%
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            //skip over duplicates in a more efficient way than .contains()
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int l = i + 1;
            int r = nums.length - 1;

            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];

                if(sum == 0){ 
                    list.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    
                    while(l < r && nums[l] == nums[l+1]){
                        l++;
                    }
                    while(l < r && nums[r] == nums[r-1]){
                        r--;
                    }

                    l++;
                    r--;
                }
                else if(sum < 0){
                    l++;
                }
                else{
                    r--;
                }


                

            }
        }

        return list;
    }
}
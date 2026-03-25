
//Correct
//Speed: Beats 5.13% 
//Memory: Beats 74.58%
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Optional<Integer> temp = Optional.ofNullable(count.get(nums[i]));

            count.put(nums[i], temp.orElse(0) + 1);
        }

        int[] returnValue = new int[k];

        for (int i = 0; i < k; i++) {
            returnValue[i] = count.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
            count.remove(returnValue[i]);
        }

        return returnValue;

    }
}
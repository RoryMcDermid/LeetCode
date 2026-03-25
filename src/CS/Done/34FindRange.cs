//Correct
//Speed: beats 100%
//Memory: beats 75.21%
public class Solution {
    public int[] SearchRange(int[] nums, int target) {


        int[] returnValues = new int[2];

        int low = 0;
        int high = nums.Length - 1;
        int index = -1;


        while(low <= high)
        {
            int mid = low + ((high - low) / 2);

            if(nums[mid] < target)
            {
                low = mid + 1;
            }
            else if (nums[mid] > target)
            {
                high = mid - 1;
            }
            else
            {
                index = mid;
                break;
            }
        }
        

        returnValues[0] = index;
        returnValues[1] = index;

        if(index == -1)
        {
            return returnValues;
        }

        while(returnValues[0] - 1 >= 0)
        {
            if (nums[returnValues[0] - 1] == target)
            {
                returnValues[0]--;
            }
            else
            {
                break;
            }
        }
        while(returnValues[1] + 1 <= nums.Length - 1)
        {

            if (nums[returnValues[1] + 1] == target)
            {
                returnValues[1]++;
            }
            else
            {
                break;
            }
        }

        return returnValues;
    }
}
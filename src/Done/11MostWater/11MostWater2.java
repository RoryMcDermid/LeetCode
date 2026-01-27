//Correct
//Speed: Beats 93.35%
//Memory: Beats 20.41%

class Solution {
    public int maxArea(int[] height) {

        int i = 0;
        int j = height.length - 1;
        int capacity = 0;

        while (i < j) {
            capacity = Math.max(capacity, Math.min(height[i], height[j]) * (j - i));
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return capacity;

    }

}
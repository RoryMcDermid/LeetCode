//Correct
//Speed: Beats 5.78%
//Memory: Beats 97.23%
//First Attempt

class Solution {
    public int maxArea(int[] height) {

        Integer maxCapacity = 0;
        Integer minPossHeight = 0;
        Integer leftSide = 0;
        Integer rightSide = 0;

        for (int i = 0; i < height.length; i++) {
            // height[i] is left side
            if (height[i] < minPossHeight) {
                continue;
            }
            for (int j = i + 1; j < height.length; j++) {

                if (height[j] < minPossHeight) {
                    continue;
                }
                if (height[i] < minPossHeight) {
                    break;
                }

                Integer currentCapacity = Math.min(height[i], height[j]) * (j - i);

                if (currentCapacity > maxCapacity) {
                    maxCapacity = currentCapacity;
                    minPossHeight = maxCapacity / height.length;
                    leftSide = i;
                    rightSide = j;
                }
            }
        }
        return maxCapacity;
    }
}
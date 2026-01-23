//Correct
//Speed: Beats 10.75%
//Memory: Beats 62.64%

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String xString = Integer.toString(Integer.valueOf(x));

        while (xString != "") {
            if (xString.charAt(0) != xString.charAt(xString.length() - 1)) {
                return false;
            }
            if (xString.length() == 1) {
                break;
            }
            xString = xString.substring(1, xString.length() - 1);
        }

        return true;

    }
}
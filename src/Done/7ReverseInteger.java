//Correct
//Speed: beats 5.98%
//Memory: beats 8.01%

class Solution {
    public int reverse(int x) {

        Integer xInt = x;

        if(xInt >= 2147483647 || xInt <= -2147483648){
            return 0;
        }

        String xString = xInt.toString();

        boolean isNegative;

        int returnInt = 0;
        
        //deal with ones that go outside 32 bit integer ([-2^31, 2^31 - 1])
        isNegative = xString.substring(0, 1).equals("-");

        if(isNegative){
            xString = xString.substring(1, xString.length());
        }

        for (int i = 0; i < xString.length(); i++) {
            returnInt += Integer.parseInt(xString.charAt(i) + "") * Math.pow(10, i);
        }

        if(isNegative){
            returnInt *= -1;
        }

        if(returnInt >= 2147483647 || returnInt <= -2147483647){
            return 0;
        }

        
        return returnInt;
    }
}
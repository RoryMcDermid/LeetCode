//Correct
//Speed: Beats 100%
//Memory: Beats 18.31%

class Solution {
    public int strStr(String haystack, String needle) {

        int length = needle.length();
        if(haystack.length() < length){
            return -1;
        }
        
        for(int i = 0; i < haystack.length() - (length - 1); i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(haystack.substring(i, i + length).equals(needle)){
                    return i;
                }
            }
        }


        return -1;
    }
}
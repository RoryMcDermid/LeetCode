//Correct
//Speed: beats 15.64%
//Memory: beats 16.03%
class LongestPalindromeSub{

    //sliding window

    public String longestPalindrome(String s) {

        String palindrome = recursivePalindrome(s, 1);

        

        return palindrome;    
    }

    public String recursivePalindrome(String s, int length){


        if(length > s.length()){
            return "";
        }

        String returnValue = recursivePalindrome(s, length + 1);

        if(returnValue.length() > length){
            return returnValue;
        }

        for (int i = 0; i < s.length()-length + 1; i++) {
            if(isPalindrome(s.substring(i, i+length))){
                return s.substring(i, i+length);
            }
        }

        return "";
    }

    public boolean isPalindrome(String s){
        int length = s.length()/2;
        for(int i = 0; i < length; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
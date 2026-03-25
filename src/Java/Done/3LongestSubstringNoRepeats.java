//Correct
//Speed: beats 35.41%
//Memory: beats 41.58%
import java.util.HashSet;

class LongestSubstringNoRepeats {

    public int lengthOfLongestSubstring(String s) {
        //sliding window
        //two pointers (or java equivalent)

        HashSet<Character> letters = new HashSet<>();

        int length = 0;

        int start = 0; //pointer A

        //i is Pointer B
        for (int i = 0; i < s.length(); i++) {
            if(!letters.contains(s.charAt(i))){
                letters.add(s.charAt(i));
                if(letters.size() > length){
                    length = letters.size();
                }
            }
            else{
                letters.remove(s.charAt(start));
                start++;
                i--;
            }
        }


        return length;
    }


}

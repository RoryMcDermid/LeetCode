
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        //go through checking for possible starting indecies
        //or make a list of all potential substrings? Would be very inefficient

        HashMap<Character, Boolean> startingIndecies = new HashMap<>();

        //what if two values in words share a starting character?
        for(int i = 0; i < words.length; i++){
            startingIndecies.put(words[i].charAt(0), true);
        }

        for(int i = 0; i < s.length(); i++){
            if(startingIndecies.containsKey(s.charAt(i))){
                //potential 
            }
        }
    }
}
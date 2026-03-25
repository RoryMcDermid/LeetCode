//Times out when it is 5000 characters and a 5000 long word (all the letter "a")


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        System.out.println(s.length());
        System.out.println(words.length);

        
        HashMap<Integer, Boolean> values = recursive(new StringBuilder(s), new ArrayList<>(Arrays.asList(words)), 0, 0, words.length);
        ArrayList<Integer> returnValue = new ArrayList<>(values.keySet());
        Collections.sort(returnValue);
        return returnValue;
    }

    //recursively check if the first X fit any of the substrings, 

    //remake using a stringbuilder to avoid substrings?


    public HashMap<Integer, Boolean> recursive(StringBuilder s, List<String> words, int pos, int offset, int originalSize){

        if(words.isEmpty()){
            HashMap<Integer, Boolean> returnValue = new HashMap<>();
            returnValue.put(pos, true);
            return returnValue;
        }

        
        if(words.getFirst().length() > s.length()){
            return new HashMap<>();
        }

        if(words.getFirst().length() * words.size() > s.length()){
            return new HashMap<>();
        }

        HashMap<Integer, Boolean> returnValue = new HashMap<>();

        //need to keep code to get positions, but change it so that as it recurses it alters the stringbuilder it passes, maybe remove offset?
        for(String string : words){
            // System.out.println(string + "," + s.substring(0, words.getFirst().length()));
            if(s.substring(0, words.getFirst().length()).equals(string)){
                List<String> temp = new ArrayList<>(words);
                temp.remove(string);
                StringBuilder tempBuilder = new StringBuilder(s);
                tempBuilder.delete(0, words.getFirst().length());
                returnValue.putAll(recursive(tempBuilder, temp, pos, offset + string.length(), originalSize));
            }
        }

        if(words.size() == originalSize){
            returnValue.putAll(recursive(s.delete(0, 1), words, pos + 1, 0, originalSize));
        }
        return returnValue;
    }

    public void printList(List<Integer> list){

        System.out.println("List");
        
        for(Integer num : list){
            System.out.println(num);
        }
        System.out.println("End of List");
    }

    public void printListString(List<String> list){

        System.out.println("List");
        
        for(String num : list){
            System.out.println(num);
        }
        System.out.println("End of List");
    }
}
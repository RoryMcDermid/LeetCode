
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        // go through checking for possible starting indecies
        // or make a list of all potential substrings? Would be very inefficient

        int length = words[0].length();
        System.out.println(s.substring(0, 0 + length));
        System.out.println(words[0]);

        HashMap<String, Boolean> startingIndecies = new HashMap<>();

        List<Integer> returnValue = new ArrayList<>();

        // what if two values in words share a starting character?
        for (int i = 0; i < words.length; i++) {
            startingIndecies.put(words[i], true);
        }

        for (int i = 0; i < s.length() - (length); i++) {
            if (startingIndecies.containsKey(s.substring(i, i + length))) {
                boolean temp = check(s, new ArrayList<>(Arrays.asList(words)), length);
                if (temp) {
                    returnValue.add(i);
                }
            }
        }
        return returnValue;
    }

    // is for some reason returning true on all instances of words, not sure why
    public boolean check(String s, ArrayList<String> words, int length) {
        if (words.size() == 0) {
            return true;
        }
        for (String word : words) {
            if (s.substring(0, length).equals(word)) {
                ArrayList<String> list = new ArrayList<>(words);
                list.remove(word);
                boolean returnValue = check(s.substring(length), list, length);
                if (returnValue) {
                    printOut(words);
                    return true;
                }
            }
        }
        return false;
    }

    public void printOut(ArrayList<String> words) {
        System.out.println("Start");
        for (String word : words) {
            System.out.print(word + ",");
        }
        System.out.println();
        System.out.println("End");
    }
}
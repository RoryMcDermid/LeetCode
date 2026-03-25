//Correct
//Speed: Beats 56.26%
//Memory: Beats 47.63%

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String[]> list = new LinkedList();
        
        for(int i = 0; i < digits.length(); i++){
            if(digits.charAt(i) == '2'){
                list.add(new String[] {"a", "b", "c"});
            }
            if(digits.charAt(i) == '3'){
                list.add(new String[] {"d", "e", "f"});
            }
            if(digits.charAt(i) == '4'){
                list.add(new String[] {"g", "h", "i"});
            }
            if(digits.charAt(i) == '5'){
                list.add(new String[] {"j", "k", "l"});
            }
            if(digits.charAt(i) == '6'){
                list.add(new String[] {"m", "n", "o"});
            }
            if(digits.charAt(i) == '7'){
                list.add(new String[] {"p", "q", "r", "s"});
            }
            if(digits.charAt(i) == '8'){
                list.add(new String[] {"t", "u", "v"});
            }
            if(digits.charAt(i) == '9'){
                list.add(new String[] {"w", "x", "y", "z"});
            }
        }

        List<StringBuilder> outerValue = new LinkedList<>();
        
        String[] first = list.poll();
        for (String value : first) {
            outerValue.add(new StringBuilder(value));
        }
        while(!list.isEmpty()){
            List<StringBuilder> tempValue = new LinkedList<>();
            String[] current = list.poll();
            for (StringBuilder value : outerValue) {
                for (String currentValue : current) {
                    tempValue.add(new StringBuilder(value).append(currentValue));
                }
            }
            outerValue = tempValue;
        }

        List<String> returnValue = new LinkedList<>();
        for(StringBuilder singlePoint : outerValue){
            returnValue.add(singlePoint.toString());
        }
        return returnValue;
    }
}
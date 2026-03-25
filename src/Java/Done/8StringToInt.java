//Correct
//Speed: beats 5.36%
//Memory: beats 5.25%


//remember that '' are used for characters, and you can do ascii maths with characters (a is outwith 0 and 9)
//remember that Integer.MAXVALUE and Integer.MINVALUE exist
//see "betterSolution"
import java.util.regex.Pattern;

class Solution {
    public int myAtoi(String s) {

        boolean positive = true;

        Integer returnValue = 0;
        
        boolean somethingFound = false;

        boolean maxed = false;


        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) + "").equals(" ")){
                if(somethingFound){
                    break;
                }
                continue;
            }
            if((s.charAt(i) + "").equals("-")){
                if(somethingFound){
                    break;
                }
                somethingFound = true;
                positive = false;
                continue;
            }
            if((s.charAt(i) + "").equals("+")){
                if(somethingFound){
                    break;
                }
                somethingFound = true;
                positive = true;
                continue;
            }
            if(Pattern.matches("[a-z.]", (s.charAt(i) + ""))){
                break;
            }
            if(Pattern.matches("[0-9]", (s.charAt(i) + ""))){
                somethingFound = true;
                if(returnValue > 214748364){
                    returnValue = 2147483647;
                    maxed = true;
                    break;
                }
                if(returnValue == 214748364){
                    if(Integer.parseInt((s.charAt(i) + "")) == 7){
                        returnValue = 2147483647;
                        break;
                    }
                    else if(Integer.parseInt((s.charAt(i) + "")) >= 7){
                        returnValue = 2147483647;
                        maxed = true;
                        break;
                    }
                }
                returnValue *= 10;
                returnValue += Integer.parseInt((s.charAt(i) + ""));
                
            }

            
        }
        if(!positive){
            returnValue *= -1;
            if(maxed){
                returnValue -= 1;
            }
        }

        
        return returnValue;
    }

}

class betterSolution{
    public int myAtoi(String s) {
        s = s.trim(); // Remove leading whitespace
        int sign = 1, i = 0;
        long res = 0; // Using long to handle overflow cases

        if (s.length() == 0) return 0;

        // Check for sign
        if (s.charAt(0) == '-') { sign = -1; i++; }
        else if (s.charAt(0) == '+') { i++; }

        // Process numerical characters
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') break; // Stop at non-numeric character

            res = res * 10 + (ch - '0'); // Convert char to number
            if (sign * res > Integer.MAX_VALUE) return Integer.MAX_VALUE; // Handle overflow
            if (sign * res < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }
        return (int) (sign * res);
    }
}
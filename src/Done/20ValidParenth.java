//Correct
//Speed: Beats 17.06%
//Memory: Beats 14.05%

//Efficient way is to forgoe the hashmap, and just do separate checks for opening and closing brackets
//If it is an opening bracket, just add it to the stack
//If it is a closing bracket, return false if the stack is empty, if not check if it matches the popped top of the stack, if not return false
//At the end if the stack isn't empty return false, otherwise return true
import java.util.HashMap;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        HashMap<Character, Character> map = new HashMap<>();

        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        map.put(')', ' ');
        map.put(']', ' ');
        map.put('}', ' ');
        
        Stack<Character> stack = new Stack();


        for(int i = 0; i < s.length(); i++){
            if(stack.isEmpty()){
                stack.push((Character) s.charAt(i));
            }
            else if(map.get(stack.peek()) != s.charAt(i)){
                stack.push((Character) s.charAt(i));
            }
            else{
                stack.pop();
            }
        }

        if(stack.isEmpty()){
            return true;
        }

        return false;

    }
}
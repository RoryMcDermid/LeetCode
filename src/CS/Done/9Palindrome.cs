//Correct
//Speed: beats 66.70%
//Memory: beats 32.33%
public class Solution {
    public bool IsPalindrome(int x) {

        String xString = x.ToString();
        Char[] xChar = xString.ToCharArray();

        int length = xChar.Length;
        
        for(int i = 0; i < (length / 2); i++)
        {
            if(!xChar[i].Equals(xChar[length - i - 1]))
            {
                return false;
            }
        }

        return true;

    }
}
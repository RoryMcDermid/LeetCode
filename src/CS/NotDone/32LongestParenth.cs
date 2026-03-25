public class Solution {
    public int LongestValidParentheses(string s) {
        
        int longest = 0;

        int count = 0;

        Char[] chars = s.ToCharArray();

        Stack<char> stack = new Stack<char>();

        for(int i = 0; i < chars.Length; i++)
        {
            if (chars[i].Equals('('))
            {
                stack.Push('(');
            }
            else
            {
                if(stack.Count() == 0)
                {
                    if(longest < count)
                    {
                        longest = count;
                    }
                    count = 0;
                }
                else
                {
                    stack.Pop();
                    count += 2;
                }
            }
        }
        if(longest < count && stack.Count() == 0) 
        {
            longest = count;
        }
        return longest;
    }
}
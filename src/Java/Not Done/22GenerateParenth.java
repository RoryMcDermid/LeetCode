
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<String> generateParenthesis(int n) {
        //probably use a tree?
        //for a given parenthesis ()
        //we can go left, right or inside
        //sometimes left and right can be identical

         //maybe a queue

        Queue<String> queue = new LinkedList<>();

        int queueSize = 0;
        for(int i = 0; i < n; i++){
            queueSize = queue.size();
            for(int j = 0; j < queue.size(); j++){
                
            }
        }
       
        return null;
    }
}
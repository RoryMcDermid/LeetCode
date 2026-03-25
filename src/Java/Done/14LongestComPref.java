class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < Math.min(prefix.length(), strs[i].length()); j++) {
                if (prefix.charAt(j) != strs[i].charAt(j)) {
                    prefix = strs[i].substring(0, j);
                }
            }
        }
        return prefix;
    }
}
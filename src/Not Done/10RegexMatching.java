//Can be solved just with "return Pattern.matches(p, s);"

class Solution {
    public boolean isMatch(String s, String p) {

        StringBuilder sB = new StringBuilder(s);
        StringBuilder pB = new StringBuilder(p);

        while (!pB.isEmpty()) {

            Character first = pB.charAt(0);
            // check the letter to look for in the pattern
            if ((first < 97 || first > 122) && first != '.') {
                System.out.println("firstFalse");
                System.out.println(sB);
                System.out.println(pB);
                return false;
            }
            // remove it from the pattern
            pB = pB.deleteCharAt(0);
            // it is a letter or a full stop
            Character second;
            // if there is another character
            if (pB.length() > 0) {
                second = pB.charAt(0);
            } else {
                // if there isn't
                second = '@';
            }

            if (second == '@') {
                if (first == '.') {
                    sB.deleteCharAt(0);
                } else if (sB.charAt(0) == first) {
                    sB.deleteCharAt(0);
                } else {
                    return false;
                }
            } else if (second == '*') {
                while (sB.charAt(0) == first || first == '.') {
                    sB.deleteCharAt(0);
                    if (sB.length() == 0) {
                        break;
                    }
                }
                pB.deleteCharAt(0);
            }
            // single character
            else {

                if (sB.charAt(0) != first) {
                    return false;
                }
            }

        }
        if (!sB.isEmpty()) {
            return false;
        }
        return true;
    }
}
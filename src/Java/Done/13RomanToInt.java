//Correct
//Speed: Beats 57.55%
//Memory: Beats 57.92%
class Solution {
    public int romanToInt(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        // check current letter, then check next letter

        int returnValue = 0;

        while (!stringBuilder.isEmpty()) {
            Character current = stringBuilder.charAt(0);
            stringBuilder.deleteCharAt(0);
            Character next = ' ';
            if (!stringBuilder.isEmpty()) {
                next = stringBuilder.charAt(0);
            }
            if (current == 'M') {
                returnValue += 1000;
            } else if (current == 'C') {
                if (next == 'M') {
                    returnValue += 900;
                    stringBuilder.deleteCharAt(0);
                } else if (next == 'D') {
                    returnValue += 400;
                    stringBuilder.deleteCharAt(0);
                } else {
                    returnValue += 100;
                }
            } else if (current == 'D') {
                returnValue += 500;
            } else if (current == 'X') {
                if (next == 'C') {
                    returnValue += 90;
                    stringBuilder.deleteCharAt(0);
                } else if (next == 'L') {
                    returnValue += 40;
                    stringBuilder.deleteCharAt(0);
                } else {
                    returnValue += 10;
                }
            } else if (current == 'L') {
                returnValue += 50;
            } else if (current == 'I') {
                if (next == 'X') {
                    returnValue += 9;
                    stringBuilder.deleteCharAt(0);
                } else if (next == 'V') {
                    returnValue += 4;
                    stringBuilder.deleteCharAt(0);
                } else {
                    returnValue += 1;
                }
            } else if (current == 'V') {
                returnValue += 5;
            }
        }

        return returnValue;

    }

}
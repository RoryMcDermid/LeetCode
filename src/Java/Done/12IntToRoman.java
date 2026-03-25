//Correct
//Speed: beats 99.42/34% (3-4ms)
//Memory: beats 54.18%

class Solution {
    public String intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder();

        int remainder = num / 1000;
        num = num % 1000;

        stringBuilder.append("M".repeat(remainder));
        if (num >= 900) {
            stringBuilder.append("CM");
            num -= 900;
        }
        // now is less than 900
        remainder = num / 500;
        num = num % 500;
        stringBuilder.append("D".repeat(remainder));
        // now is less than 500
        if (num >= 400) {
            stringBuilder.append("CD");
            num -= 400;
        }
        // now is less than 400
        remainder = num / 100;
        num = num % 100;
        stringBuilder.append("C".repeat(remainder));
        // now is less than 100
        if (num >= 90) {
            stringBuilder.append("XC");
            num -= 90;
        }
        // now is less than 90
        remainder = num / 50;
        num = num % 50;
        stringBuilder.append("L".repeat(remainder));
        // now is less than 50
        if (num >= 40) {
            stringBuilder.append("XL");
            num -= 40;
        }
        // now is less than 40
        remainder = num / 10;
        num = num % 10;
        stringBuilder.append("X".repeat(remainder));
        // now is less than 10
        if (num >= 9) {
            stringBuilder.append("IX");
            num -= 9;
        }
        // now is less than 9
        remainder = num / 5;
        num = num % 5;
        stringBuilder.append("V".repeat(remainder));
        // now is less than 5
        if (num >= 4) {
            stringBuilder.append("IV");
            num -= 4;
        }
        remainder = num / 1;
        num = num % 1;
        stringBuilder.append("I".repeat(remainder));
        return stringBuilder.toString();

    }
}
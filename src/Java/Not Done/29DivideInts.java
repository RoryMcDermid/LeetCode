    class Solution {
        public int divide(int dividend, int divisor) {
            
            int result = 0;

            //still doesn't work when dividend is minimum value

            boolean dividendSign = false;
            boolean divisorSign = false;

            if(dividend < 0){
                dividendSign = true;
            }
            if(divisor < 0){
                divisorSign = true;
            }

            if(dividend == 0){
                return 0;
            }

            dividend = Math.abs(dividend);
            divisor = Math.abs(divisor);

            while(dividend >= divisor){
                dividend -= divisor;
                result++;
            }

            if(dividendSign){
                result *= -1;
            }
            if(divisorSign){
                result *= -1;
            }

            

            return result;

        }
    }
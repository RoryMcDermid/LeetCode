//Correct
//Speed: beats 24%
//Memory: beats 14.16%

class ZigZag{

    public String convert(String s, int numRows) {

        int currentRow = 0;
        boolean forwards = true;
        String returnValue = "";

        if(numRows == 1){
            return s;
        }

        StringBuilder[] sb = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }
        
        for(int i = 0; i < s.length(); i++){
            sb[currentRow].append(s.charAt(i));
            if(forwards && currentRow < numRows - 1){
                currentRow++;
            }
            else if(!forwards && currentRow > 0){
                currentRow--;
            }
            else if(currentRow == numRows - 1){
                currentRow--;
                forwards = false;
            }
            else{
                currentRow++;
                forwards = true;
            }
        }

        for (int i = 0; i < numRows; i++) {
            returnValue += sb[i];
        }

        return returnValue;
    }
}
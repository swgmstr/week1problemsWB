// unsolved
// Your input
// 5
// Output
// 5
// Expected
// 2

class Solution {
    public int findComplement(int num) {
        StringBuilder numStr = new StringBuilder(Integer.toBinaryString(num)); //holds initial binary string

        for(int i = 0; i < numStr.length(); i++){ //convert  '0's to '1's and vice versa for every binary digit
            if(numStr.charAt(i) == 1){
                numStr.setCharAt(i,'0');
            }else if(numStr.charAt(i) == 0){
                numStr.setCharAt(i,'1');
            }
        }
        String endStr = numStr.toString(); //convert to string type
        int endNum = Integer.parseInt(endStr, 2);// convert to new binary number
        return endNum; //return the new binary number (complement)
    }
}

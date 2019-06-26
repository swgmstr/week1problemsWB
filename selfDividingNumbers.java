//unsolved
// Your input
// 1
// 22
// Output
// [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,22]
// Expected
// [1,2,3,4,5,6,7,8,9,11,12,15,22]

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
       List<Integer> numList = new ArrayList<Integer>();

        int tempNum = 1;//just a starting flag for initialwhile loop
        int num = left;
        int numDigits = 0;
        int num2 = 0;
        String strInt = ""; //for conversion to string to detect number at given index
        for( int i = left; i <= right; i++){
            while ( tempNum != 0 ){
                tempNum = num / 10; // temp number holder
                numDigits++; // add 1 to counter to number of digits
            }
            strInt = Integer.toString(i); //i was 'left' previously but changed first floop to i
            for(int j = 0; j < numDigits; j++){
                num2 = Character.getNumericValue(strInt.charAt(j)); //one digit division at a time
                if ( ( i % num2 ) == 0)//if original num divisible by digit then add to list
                {
                    numList.add(i);
                }
            }
          tempNum = 1; //reset flag
          numDigits =0; //reset num of digits counter for next number
        }
        return numList;
    }
}

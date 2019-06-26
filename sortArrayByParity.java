
// unsolved

// Last test case results:


// Your input
// [3,1,2,4]
// Output
// [0,0,2,4]
// Expected
// [2,4,3,1]

class Solution {
    public int[] sortArrayByParity(int[] A) {

        int[] arr = new int [A.length];
        for(int i = 0; i < A.length; i++ ){
            if(A[i] % 2 == 0){ //if is even then store it at front of array
                arr[i] = A[i];

                //if statement might not work for cases where even numbers are at the end of the array. They will be stored in the same spot(at the end) and that is incorrect. Comeback to this and see if we can fix.
            }else{ //if not even then store it at the end of the array
            arr[A.length - (i+1)] = A[i];
            }
        }
        return arr;
    }
}

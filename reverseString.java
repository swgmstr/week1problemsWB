
// SOLVED
// ["p","a","r","t","y","h","a","r","d","y"]
// Output
// ["y","d","r","a","h","y","t","r","a","p"]
// Expected
// ["y","d","r","a","h","y","t","r","a","p"]

class Solution {
    public void reverseString(char[] s) {

        int n = s.length;
        char temp =' ';

        for(int i=0; i < (n/2); i++){
            temp = s[i];
            s[i] = s[ n - (i+1) ] ;
            s[ n - (i+1)] = temp;
        }
    }
}

import java.util.*;
class validAnagram {

      public boolean isAnagram(String s, String t){
        //String a = s;
        //String b = t;
      //anagram = word contains all same letters but may be in different order
        boolean flag = true;
        for(int i = 0; i < s.length(); i++){
            for (int j = 0; j < t.length() ; j++){
              if(s.charAt(i) == t.charAt(j)){
              flag = true;
            }
            if(flag == false){
              return flag;
            }
          }
        }
        return flag;
      }

      public static void main(String[]args){
        validAnagram vn = new validAnagram();
        String s="pattern";
        String t="nrettba";
        System.out.println(vn.isAnagram(s, t));
      }
}
//Almost Solved

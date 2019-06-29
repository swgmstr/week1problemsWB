class Solution {
    public int singleNumber(int[] nums) {
        boolean flag = false;
        int ans = 0;
        for(int i =0; i < nums.length; i++){
            for (int j = i ; j < nums.length; i++){
                if(nums[i] == nums[j+1]){
                    flag = true;
                    break;
                }else{
                    ans = nums[i];
                    flag= false;
                    return ans;
                }
            }
        }
        return ans;
    }
}
unsolved
Finished
Runtime: 0 ms
Your input
[2,2,1]
Output
2
Expected
1

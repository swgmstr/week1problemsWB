class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = {0,0};
        for(int i = 0 ; i < nums.length; i++ ){
            for(int j = i; j < nums.length; j++){
                if((nums[i] + nums[j] ) == target){
                        indices[0] = i;
                        indices[1] = j;
                }
            }
        }
        return indices;
    }
}

SOlVED
Your input
[2,7,11,15,20]
27
Output
[1,4]
Expected
[1,4]

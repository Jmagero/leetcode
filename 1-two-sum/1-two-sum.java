class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int [2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
            int complementary = target-nums[i];
             if(nums[j] == complementary){
                 arr[0] = i;
                 arr[1] = j;
             }
            
            }
            
        }
        return arr;
    }
}
class Solution {
    public int[] getConcatenation(int[] nums) {
        int j = nums.length;
        int[] ans = new int[nums.length*2];
        System.arraycopy(nums,0, ans,0,j); 
        System.arraycopy(nums,0,ans,j, nums.length);
        return ans;
    }
}
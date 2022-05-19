class Solution {
    public int removeDuplicates(int[] nums) {
        int i = nums.length > 0 ? 1 : 0;
        for( int n : nums){
            if(n > nums[i-1])
                nums[i++] = n;
        }
        return i;
    }
            //if(nums.length == 0)
           // return 0;
        // int i = 0; //current index
        // int j = 1; //iterator
        // for(; j< nums.length; j++){
        //     if(nums[j] != nums[i]){
        //         i++;
        //         nums[i] = nums[j];
        //     }
        // 
}
class Solution {
    public int[] sortArray(int[] nums){
     for(int i = 0; i < nums.length; i++){
          int red = i-1;
          int temp = nums[i];
         while(red>=0 && nums[red] > temp){
             nums[red+1] = nums[red];
             red--;
         }
         nums[red+1] = temp;
        }
     return nums;
    }
}

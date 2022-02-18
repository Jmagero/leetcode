class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map = new HashMap<>();
         for(int i=0; i < nums.length; i++){
             int complement = target - nums[i];
             if(map.containsKey(complement)){
                 int indexComp = map.get(complement);
                 return new int[]{i,indexComp};
                }else{
                 map.put(nums[i],i);
                }
        } 
        return new int [] {0,0};
    }
}
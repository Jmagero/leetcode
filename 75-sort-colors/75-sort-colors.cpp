class Solution {
public:
    void sortColors(vector<int>& nums) {
        int red = -1;
        int green = -1;
        int blue = -1;
        for (int i = 0; i < nums.size(); i++){
            if(nums[i] == 0){
              
                // nums.set(red,nums.get(i));
                // nums.set(i,nums.get(red));
                green++;
                swap(nums,green,i);
                red++;
                swap(nums,red,green);
                // nums.set(green,nums.get(i));
                // nums.set(i,nums.get(green));
            } else if(nums[i] == 1){
                green++;
                swap(nums,green,i);
                // nums.set(green,nums.get(i));
                // nums.set(i,nums.get(green));
            }
        }
    }
   void swap(vector<int>& arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
        
};
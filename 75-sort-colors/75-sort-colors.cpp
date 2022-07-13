class Solution {
public:
    void sortColors(vector<int>& nums) {
        int red = -1;
        int green = -1;
        for (int i = 0; i < nums.size(); i++){
            if(nums[i] == 0){
                green++;
                swap(nums,green,i);
                red++;
                swap(nums,red,green);
            } else if(nums[i] == 1){
                green++;
                swap(nums,green,i);
            }
        }
    }
   void swap(vector<int>& arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }   
};
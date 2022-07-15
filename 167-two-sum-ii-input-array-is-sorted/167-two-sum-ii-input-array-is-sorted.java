class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length -1;
        int[] arr = new int[2];
        while(i < j){
            int comp = target - numbers[i];
            if(numbers[j] == comp){
                arr[0] = i+1;
                arr[1] = j+1;
                return arr;
            }else if(numbers[j] > comp){
                j--;
            }else{
                i++;
            }
        }
     return arr;    
    }
}
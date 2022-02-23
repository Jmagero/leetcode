class Solution {
    public boolean isPalindrome(int x) {
          int reversedNum = 0;
          int z = x;
    while(z > 0){
      int lastDigit = z % 10;
      reversedNum = reversedNum * 10 + lastDigit;
      z/=10;
    }
    
    return x == reversedNum; 
    }
}
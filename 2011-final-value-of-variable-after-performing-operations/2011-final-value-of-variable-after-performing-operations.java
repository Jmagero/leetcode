class Solution {
    public int finalValueAfterOperations(String[] operations) {
          return Arrays.stream(operations,0,operations.length)
            .mapToInt(operation->operation.charAt(1)=='+'?1:-1)
            .sum();
        // int x = 0;
        // for(String word : operations){
        //     if(word.equals("X++") || word.equals("++X")){
        //         x++;
        //     }else{
        //         x--;
        //     }
        // }
        // return x;
    }
}
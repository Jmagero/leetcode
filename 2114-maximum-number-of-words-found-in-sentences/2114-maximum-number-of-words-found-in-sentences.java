class Solution {
    public int mostWordsFound(String[] sentences) {
         int max=0;
        for(int i=0; i<sentences.length; i++) {
            max = Math.max(max,(sentences[i].split(" ")).length);
        }
        return max;
        // int[] arr = new int[sentences.length];
        // for(int i =0; i< sentences.length; i++){
        //     arr[i] = sentences[i].split(" ").length;
        // }
        // return Arrays.stream(arr).max().getAsInt();
    }
}
class Solution {
    public int mostWordsFound(String[] sentences) {
        //int[] arr = new int[sentences.length];
        int max = 0;
        for(int i =0; i< sentences.length; i++){
            max = Math.max(max,(sentences[i].split(" ").length));
            //arr[i] = sentences[i].split(" ").length;
        }
        // for( String sentence : sentences){
        //     arr[sentence] = sentence.split(" ").length;
        // }
        //return Arrays.stream(arr).max().getAsInt();
        return max;
    }
}
class Solution {
    public int mostWordsFound(String[] sentences) {
        int[] arr = new int[sentences.length];
        for(int i =0; i< sentences.length; i++){
            arr[i] = sentences[i].split(" ").length;
        }
        return Arrays.stream(arr).max().getAsInt();
    }
}
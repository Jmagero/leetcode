class Solution {
    
    public int[] sortArray(int[] nums){
        return helper(nums,0,nums.length-1);

    }
    public int[] helper(int[]A, int start,int end){
        //#leafnodes
        if(start==end)return A;
        
        
        //#internal nodes
        int mid = (start+end)/2;
        if(start < end){
           helper(A,start,mid);
           helper(A,mid+1,end);  
        }
       
        //#merging both parts
        int[] tmp = new int [end-start+1];
        int i=0;
        int first = start;
        int last = mid+1;
        while(first<=mid && last <= end){
            tmp[i++] = A[first] < A[last] ? A[first++] : A[last++];
        }
        while (first <= mid) { tmp[i++] = A[first++]; } 
        while (last <= end) { tmp[i++] = A[last++]; } 
        i = 0; 
        while (start <= end) { A[start++] = tmp[i++]; }

        //gathering remainging elements
        // while(first <= mid){
        //     aux[idx] = A[i];
        //     i++;
        //     idx++;
        // }
        // while(j <= end){
        //     aux[idx] = A[j];
        //     j++;
        //     idx++;
        // }
        //   System.out.print(Arrays.toString(aux));
        //  A = aux.clone();
        // // System.arraycopy( aux, 0, A, 0, aux.length );
        // //System.arraycopy( src, 0, dest, 0, src.length );
        return A;
    }
}


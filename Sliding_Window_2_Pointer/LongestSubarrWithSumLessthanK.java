package Sliding_Window_2_Pointer;
//o(n2) tc

public class LongestSubarrWithSumLessthanK {
    public static void main(String[] args) {
        
    }

    public static int LongestSubarr(int arr[],int k){
        int maxlen=0;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for(int j=i;j<arr.length;j++){
                    sum=sum+arr[j];
                    if(sum<=k){
                        maxlen=Math.max(maxlen,j-i+1 );
                    }
                    else if(sum>k) break;
            }
        }
        return maxlen;
    }
}

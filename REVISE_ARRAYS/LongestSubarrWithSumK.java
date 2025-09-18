import java.util.HashMap;

public class LongestSubarrWithSumK {
    public static void main(String[] args) {
        
    }

    public static int LongestSubarr(int arr[],int k){
        HashMap<Integer,Integer> PreSumMap= new HashMap<>();

        int sum=0;
        int maxLen=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                maxLen=Math.max(maxLen, i+1);
            }

            int rem=sum-k;
            if(PreSumMap.containsKey(rem)){
                int len=i-PreSumMap.get(rem);
                maxLen=Math.max(len,maxLen);
            }

            if(!PreSumMap.containsKey(sum)){
                PreSumMap.put(sum, i);
            }


        }
        return maxLen;
    }
}

package JAVA_ARRAYS;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrWithSumk {
    public static void main(String[] args) {
         int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;

        System.out.println(Subarr(arr, k)); // Output: 4
        
    }
    public static int  Subarr(int []nums,int k){
          Map<Integer, Integer> map = new HashMap<>(); // sum → first index
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            // If sum itself equals k
            if (sum == k) {
                maxLen = i + 1;
            }

            // Store sum if not already stored
            map.putIfAbsent(sum, i);

            // Check if (sum - k) exists
            if (map.containsKey(sum - k)) {
                int len = i - map.get(sum - k);
                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;
            
        

    }
    
}


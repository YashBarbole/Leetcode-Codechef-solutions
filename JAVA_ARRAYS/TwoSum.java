package JAVA_ARRAYS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        int target = 3;
        int[] ans=twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
        
    }
     public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>mp=new HashMap<>();
        int n = nums.length;

        for(int i=0;i<n;i++){
            int complement=target-nums[i];
            if(mp.containsKey(complement)){
                return new int []{mp.get(complement),i};
            }
            mp.put(nums[i],i);
        }
        return new int []{};

        
    }
    
}

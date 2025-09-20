package Sliding_Window_2_Pointer;

import java.util.ArrayList;

public class GenerateSubArrays {
    public static void main(String[] args) {
        int arr[] = {2, 5, 4, -5, -7, -9};
        Maxsubarray(arr);
    }

    public static void Maxsubarray(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        ArrayList<ArrayList<Integer>> maxSubarrays = new ArrayList<>();

        // Generate all subarrays
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                ArrayList<Integer> subarray = new ArrayList<>();
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    subarray.add(arr[k]);
                    sum += arr[k];
                }

                // Compare sum with maxSum
                if (sum > maxSum) {
                    maxSum = sum;
                    maxSubarrays.clear();
                    maxSubarrays.add(new ArrayList<>(subarray));
                } else if (sum == maxSum) {
                    maxSubarrays.add(new ArrayList<>(subarray));
                }
            }
        }

        // Print result
        System.out.println("Max Sum: " + maxSum);
        System.out.println("Subarrays with max sum: " + maxSubarrays);
    }
}

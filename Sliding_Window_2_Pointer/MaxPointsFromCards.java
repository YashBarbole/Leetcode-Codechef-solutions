package Sliding_Window_2_Pointer;

public class MaxPointsFromCards {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;
        System.out.println(MaxPoints(arr, k)); // Expected output: 12
    }

    public static int MaxPoints(int arr[], int k) {
        int lsum = 0;
        int rsum = 0;
        int maxSum = 0;

        // Take first k elements from left
        for (int i = 0; i < k; i++) {
            lsum += arr[i];
        }
        maxSum = lsum;

        int rindex = arr.length - 1;

        // Now slide: remove from left, add from right
        for (int i = k - 1; i >= 0; i--) {
            lsum -= arr[i];           // remove one from left
            rsum += arr[rindex];      // add one from right
            rindex--;

            maxSum = Math.max(maxSum, lsum + rsum);
        }

        return maxSum;
    }
}

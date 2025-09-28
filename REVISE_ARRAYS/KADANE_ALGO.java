public class KADANE_ALGO {
    public static void main(String[] args) {
        int arr[]={1,3,5,6,7,2,-2,-4,-5,3,2};
        int n=arr.length;
        System.out.println(MaxSumSubarr(arr, n));
    }

   public static int MaxSumSubarr(int arr[], int n) {
    int sum = 0;
    int maxi = Integer.MIN_VALUE;

    int start = 0, end = 0, tempStart = 0;

    for (int i = 0; i < n; i++) {
        if (sum == 0) tempStart = i; // potential start
        sum += arr[i];

        if (sum > maxi) {
            maxi = sum;
            start = tempStart; // update start of max subarray
            end = i;           // update end of max subarray
        }

        if (sum < 0) {
            sum = 0;           // reset current sum
        }
    }

    // Print the subarray
    System.out.print("Max Sum Subarray: ");
    for (int i = start; i <= end; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();

    return maxi;
}}
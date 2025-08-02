package JAVA_ARRAYS;

import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
             int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;

        Leftrotate(arr1, k);
        System.out.println(Arrays.toString(arr1));
        rightRotate(arr2, k);
        System.out.println(Arrays.toString(arr2));
       
        
    }
//left rotate
    public static void Leftrotate(int [] a,int d){
        int  n=a.length;
        d=d%n;
   
        reverse(a, 0, d-1);
        reverse(a, d, n-1);
        reverse(a, 0, n-1);
    }
    //right
    public static void rightRotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle k > n

        reverse(nums, 0, n - 1);     // Step 1: Reverse whole array
        reverse(nums, 0, k - 1);     // Step 2: Reverse first k elements
        reverse(nums, k, n - 1);     // Step 3: Reverse remaining n-k elements
    }
//reverse
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    
}

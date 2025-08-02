package JAVA_ARRAYS;

public class checkSorted {
        public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 3, 4, 1};

        System.out.println(isSorted(arr1)); // true
        System.out.println(isSorted(arr2)); // false
            
        }

        public static boolean isSorted(int nums[]){
             for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false; // Found a decreasing pair
            }
        }
        return true; // No decreasing pair found
    }

        }


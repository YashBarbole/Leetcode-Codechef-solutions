package JAVA_ARRAYS;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDupli {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        int[] uniqueArr = removeDuplicates(arr);

        System.out.println(Arrays.toString(uniqueArr)); // [1, 2, 3, 4, 5]
    }

     public static int[] removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>(); // Keeps insertion order
        for (int num : nums) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        return result;
    }
    }
    


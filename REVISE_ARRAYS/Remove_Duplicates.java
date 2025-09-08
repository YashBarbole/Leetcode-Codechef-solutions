import java.util.HashSet;

import JAVA_ARRAYS.removeDupli;

public class Remove_Duplicates {
    public static void main(String[] args) {
        int []arr={2,3,4,4,5,6};
        System.out.println(removeDuplicates(arr));
    }

    public static HashSet removeDuplicates(int[]arr){
        HashSet set= new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
            System.out.println(set.size());
        }
        return set;
    }
}

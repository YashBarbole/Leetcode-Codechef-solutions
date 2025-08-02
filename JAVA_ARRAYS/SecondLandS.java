package JAVA_ARRAYS;

import java.util.ArrayList;

public class SecondLandS {

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};

        System.out.println("Second Largest: " + SecondLargest(arr));
        System.out.println("Second Smallest: " + SecondSmallest(arr));
        System.out.println("Both: " + SecondOrderElements(arr));
    }

    public static int SecondLargest(int[] arr) {
        int largest = arr[0];
        int secLargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secLargest) {
                secLargest = arr[i];
            }
        }
        return secLargest;
    }
    
    public static int SecondSmallest(int[] arr) {
        int smallest = arr[0];
        int secSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < secSmallest) {
                secSmallest = arr[i];
            }
        }
        return secSmallest;
    }

    public static ArrayList<Integer> SecondOrderElements(int[] arr) {
        int Slargest = SecondLargest(arr);
        int Ssmallest = SecondSmallest(arr);

        ArrayList<Integer> result = new ArrayList<>();
        result.add(Slargest);
        result.add(Ssmallest);

        return result;
    }
}

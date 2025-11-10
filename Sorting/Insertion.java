package Sorting;

import java.util.Arrays;
//takes elemetn and places in correct position wiht increasing array size
// Time Complexity
// Case	Time
// Best Case	O(n) (if array already sorted)
// Average Case	O(n²)
// Worst Case	O(n²)
public class Insertion {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void Insertion(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                Swap(arr, j-1, j);
                j--;
            }    
        }
    }
    public static void Swap(int []arr,int a,int b){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
    
}

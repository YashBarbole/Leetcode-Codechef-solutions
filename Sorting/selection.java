package Sorting;

import java.util.Arrays;

import corejava.swap;

//select minimums and swap
public class selection {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void SelectionSort(int [] arr){
        int n=arr.length;
        for (int i=0;i<n-2;i++){
            {
                int mini=i;
                for (int j=i+1;j<=n-1;j++){
                    if(arr[j]<arr[mini]) {
                        mini=j;
                    }
                    Swap(arr, i, mini);
                }
            }
        }
    }

    public static void Swap(int []arr,int a,int b){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
}

package Sorting;
//adjacent swapping 
import java.util.Arrays;
//tc Time Complexity
// Case	Time
// Best Case	O(n) (if already sorted)
// Average Case	O(n²)
// Worst Case	O(n²)
public class bubble {
    public static void main(String[] args) {
         int[] arr = {64, 25, 12, 22, 11};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void Bubble(int arr[]){
        int n=arr.length;
        for (int i=n-1;i>=1;i--){
            int didswap=0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    Swap(arr, j, j+1);
                    didswap++;
                }
            }
            if(didswap==0){
                break;
            }
        }
    }

    public static void Swap(int []arr,int a,int b){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
}

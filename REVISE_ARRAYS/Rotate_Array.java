import java.util.Arrays;
public class Rotate_Array {
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Rotate_arrayLeft(arr, 2);
        System.out.println(Arrays.toString(arr));
        Rotate_arrayRight(arr, 2);
     
         Rotate_arrayRight(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }    

    static void Rotate_arrayLeft(int arr[],int d){
            int n=arr.length;
            d=d%n;
            reverse(arr,0,d-1);
            reverse(arr,d,n-1);
            reverse(arr,0,n-1);
    }

   static void Rotate_arrayRight(int arr[],int k){
            int n=arr.length;
            k=k%n;
            reverse(arr,0,n-1);
            reverse(arr, 0, k-1);
            reverse(arr, k, n-1);
    }
}

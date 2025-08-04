package JAVA_ARRAYS;

import java.util.ArrayList;

public class SearchInRotatedSortedArr {
    public static void main(String[] args) {
              int[] arr = {3, 4, 5, 1, 2};
        int k = 2;
        int ans=Search(arr, k);
        System.out.println(ans);
        
    }
    public static int Search(int []arr,int k){
        int n=arr.length;
        int l=0,h=n-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==k){
                return mid;
            }
            //left sortted
            if(arr[l]<=arr[mid]){
                if(arr[l]<=k&& k<=arr[mid]){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(arr[mid]<=k && k<=arr[h]){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }

            }
        }
        return -1;


    }   
}

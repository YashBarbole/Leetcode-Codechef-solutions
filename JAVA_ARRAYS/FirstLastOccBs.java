package JAVA_ARRAYS;

import java.util.ArrayList;

public class FirstLastOccBs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int k = 2;
        ArrayList<Integer> ans=FirstLast(arr, k);
        System.out.println(ans);
    }


    public static ArrayList<Integer> FirstLast(int []arr,int k){
        int first = findFirst(arr, k);
        int last = findlast(arr, k);

        ArrayList<Integer> res = new ArrayList<>();
        res.add(first);
        res.add(last);
        return res;
    }



    public  static int findFirst(int[]arr,int x){
        int n=arr.length;
        int low=0,high=n-1;
        int first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return first;
    }

    
    
    public  static int findlast(int[]arr,int x){
        int n=arr.length;
        int low=0,high=n-1;
        int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return last;

    }
    
}

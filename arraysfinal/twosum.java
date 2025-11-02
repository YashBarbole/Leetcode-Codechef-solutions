package arraysfinal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class twosum {
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        System.out.println(Arrays.toString(TWOSUMOPTIMAL(arr, 07)));
    }
    public static Boolean TwoSum(int arr[],int k){//bool ans type 1
        HashMap<Integer,Integer>mp= new HashMap<>();
        for(int i=0;i<arr.length;i++){
          int num=arr[i];
          int rem=k-arr[i];

          if(mp.containsKey(rem)){
            return true;
          }
          else{
            mp.put(num, i);
          }
        }
        return false;
    }

    public static int [] TWOSUM(int arr[],int k){//return numbers
        HashMap<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int rem=k-num;
            if(mp.containsKey(rem)){
                return new int []{rem,num};
            }
            else{
                mp.put(num, i);
            }
        }
        return new int [] {};
    }

    public static int[] TWOSUMOPTIMAL(int arr[],int k){
        HashSet<Integer>s= new HashSet<>();

        for(int num:arr){
            int rem=k-num;
            if(s.contains(rem)){
                return new int []{num,rem};

            }
            else{s.add(num);
            }
        }
        return new int []{};
    }
}

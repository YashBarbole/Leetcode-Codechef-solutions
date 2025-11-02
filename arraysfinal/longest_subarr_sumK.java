package arraysfinal;

import java.util.HashMap;

public class longest_subarr_sumK {
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        System.out.println(LONGEST2(arr, 5));
    }

    public static int LONGEST1(int arr[],int o){//brute  o(n2)
        int n=arr.length;
        int len=0;
        for(int i=0;i<n;i++){
                 int sum=0;
               for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==o){
                    len=Math.max(len, j-i+1);
                }
        }
        }
        return len;
     
    }

    public static int LONGEST2(int arr[],int s){//better sc-o(n) worst case
        HashMap<Integer,Integer>mp= new HashMap<>();
        int sum=0;
        int maxlen=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(sum==s){
                maxlen=Math.max(maxlen,i+1);
            }
            int rem=sum-s;
            if(mp.containsKey(rem)){
                int len=i-mp.get(rem);
                maxlen=Math.max(maxlen,len);
            }
            if(!mp.containsKey(sum)){
                mp.put(sum, i);
            }
        }
        return maxlen;



    }

}

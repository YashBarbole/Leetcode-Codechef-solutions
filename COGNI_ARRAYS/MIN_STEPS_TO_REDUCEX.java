package COGNI_ARRAYS;

public class MIN_STEPS_TO_REDUCEX {
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        int x=7;
        System.out.println(MinSteps(arr, x));
    }

    public static int MinSteps(int arr[],int x){
        int tsum=0;
        for(int num:arr){
            tsum+=num;
        }

        int target=tsum-x;
        if(target<0)return -1;

        int maxl=-1;
        int csum=0;
        int left=0;
        for(int right=0;right<arr.length;right++){
            csum+=arr[right];

            while(csum>target && left<=right){
                csum-=arr[left];
                left++;
            }

            if(csum==target){
                maxl=Math.max(maxl,right-left+1);
            }
        }
        return maxl;
    }
}

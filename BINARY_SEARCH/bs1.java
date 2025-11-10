package BINARY_SEARCH;
//iterative
public class bs1 {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(arr.length);
        System.out.println(BS1(arr, 2));
        System.out.println(BS2(arr, 0,arr.length-1, 3));

    }

    public static int BS1(int []arr,int target){
        int n=arr.length;
        int l=0;
        int h=n-1;
        while (l<=h) {
            int mid=(l+h)/2;
            if(arr[mid]==target)return mid;
            else if(target>arr[mid])l=mid+1;
            else h=mid-1;
        }
        return -1;

    }

    public static int BS2(int arr[],int l,int h,int target){
        if(l>h)return -1;
        int mid=(l+h)/2;
        if(arr[mid]==target){
        return mid;}
        else if(target>arr[mid]){
        return  BS2(arr, mid+1, h, target);}
        else {
        return BS2(arr, l, mid-1, target);
        }
    
    }
}

public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        System.out.println(Missing(arr));
    }

    static int Missing(int arr[]){
        int total_sum=0;
        int n=arr.length;
        int Real_sum= ((n+1)*(n+2))/2;
        for (int i = 0; i < arr.length; i++) {
            total_sum+=arr[i];
        }
        return Real_sum-total_sum;
    }
}

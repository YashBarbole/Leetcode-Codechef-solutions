public class SORT_012 {
    public static void main(String[] args) {
        
    }

    public static void SORT012(int arr[]){
        int n=arr.length;
        int low=0;
        int mid=0;
        int high=n-1;

        while(mid<=high){
            if(arr[mid]==0){
                Swap(arr, mid, low);
                low++;
                mid++;
            }

            else if(arr[mid]==1){
                mid++;
            }
            else{
                Swap(arr, mid, high);
                high--;
                mid++;
            }
        }

    }

    public static void Swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}

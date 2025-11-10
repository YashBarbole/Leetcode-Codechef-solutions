package sorting_revise;
// //tc==Case	Time sc=0(1)
// Best Case	O(n²)
// Average Case	O(n²)
// Worst Case	O(n²)
public class selection {
    public static void main(String[] args) {
        

    }

    public void selectionsort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            int mini=i;
            for(int j=i;j<n-1;j++){
                if(arr[mini]<arr[j]){
                    swap(arr,mini,j);
                }
            }
        }
    }

    public static void swap(int []arr,int a,int b){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        
        
    }
}

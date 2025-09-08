

public class Sec_Order_Ele {
    public static void main(String[] args) {
        int []arr= {1,3,6,7};
        System.out.println(SecondLargest(arr));
        System.out.println(SecondSmallest(arr));
    }

public static int SecondLargest(int []arr){
    int largest=arr[0];
    int slargest=-1;

    for(int i=1;i<arr.length;i++){
        if(arr[i]>largest){
            slargest=largest;
            largest=arr[i];
        }
        else if(arr[i]<largest && arr[i]>slargest){
            slargest=arr[i];
        }
    }
    return slargest;
}

public static int SecondSmallest(int []arr){
    int smallest=arr[0];
    int ssmallest=Integer.MAX_VALUE;
    for(int i=1;i<arr.length;i++){
        if(arr[i]<smallest){
            ssmallest=smallest;
            smallest=arr[i];
        }
        else if(arr[i]>smallest && arr[i]<ssmallest){
            ssmallest=arr[i];
        }
    }
    return ssmallest;
}
}

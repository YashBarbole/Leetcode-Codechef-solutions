import java.util.ArrayList;
import java.util.Arrays;

public class ARRANGE_ELEMENTS_SIGN {
    public static void main(String[] args) {
        int arr[]={2,-3,-4,-5,6,7};
        REARRAMGE(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void REARRAMGE(int arr[]){
        ArrayList<Integer> pos= new ArrayList<>();
        ArrayList<Integer> neg= new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }

        }

        for (int i = 0; i < pos.size(); i++) {
            arr[2 * i] = pos.get(i);     // even index → positive
            arr[2 * i + 1] = neg.get(i); // odd index → negative
        }
    } 

    public static void REARRANG_OPTIMAL(int arr[]){
        
    }
}

import java.util.ArrayList;

public class PrintAllSubarray {
      public static void main(String[] args) {
        int [] arr={1,3,4,5};
        System.out.println(AllSubArrays(arr));

    }
    public static  ArrayList<ArrayList<Integer>> AllSubArrays(int arr[]){
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    int n= arr.length;
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            ArrayList<Integer> sub= new ArrayList<>();
            for(int k=i;k<=j;k++){
                sub.add(arr[k]);
                }
                list.add(sub);
            }

        }
        return list;
    }
}

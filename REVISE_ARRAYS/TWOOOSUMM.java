import java.util.HashMap;

public class TWOOOSUMM {
    public static void main(String[] args) {
        
    }

    public static int [] Twosumm(int []arr,int target){
        HashMap<Integer,Integer>map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement= target-arr[i];

            if(map.containsKey(complement)) return new int[]{map.get(complement),i};
            else map.put(arr[i], i);

        }
        return new int[]{-1,-1};
    }


}

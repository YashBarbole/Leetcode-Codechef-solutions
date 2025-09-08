import java.util.HashMap;

public class twoosum {
    // O(n)
    public static void main(String[] args) {
        int []arr={3,5,8,9,};
        int target=14;
        int [] ans= Twoosum(arr, target);
        System.out.println(ans[0]+","+ans[1]);
    }

    static int [] Twoosum(int []arr,int target){
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int a=arr[i];
            int more=target-a;
            if(map.containsKey(more)){
                return new int []{map.get(more),i};
            }
            map.put(arr[i],i );
        }
        return new int []{-1,-1} ;
    }
}

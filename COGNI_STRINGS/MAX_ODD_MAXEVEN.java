package COGNI_STRINGS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MAX_ODD_MAXEVEN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        Map<Character,Integer> freq=new HashMap<>();
        for(char c:s.toCharArray()) freq.put(c,freq.getOrDefault(c,0)+1);
        int maxOdd=Integer.MIN_VALUE;
        int minEven=Integer.MAX_VALUE;

        for(int cnt:freq.values()){
            if(cnt%2==1)maxOdd=Math.max(maxOdd, cnt);
            else minEven=Math.min(minEven, cnt);
        }
        System.out.println(Math.abs(maxOdd-minEven));

    }
}

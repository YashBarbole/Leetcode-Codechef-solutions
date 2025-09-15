package COGNI_STRINGS;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LONGEST_SUBSTR_WITHOUT_REPEAT {
    public static void main(String[] args) {
        String a="YashH";
        System.out.println(Longest_substr(a));
    }

    public static int Longest_substr(String s){

        int st=0;
        int e= 0;
        Set<Character> set= new HashSet<>();

        int maxL=0;

        while(e<s.length()){
            if(!set.contains(s.charAt(e))){
                set.add(s.charAt(e));
                e++;
                maxL=Math.max(maxL, set.size());
            }
            else{
                set.remove(s.charAt(st));
                st++;
            }
        }

        return maxL;

        
    }
}

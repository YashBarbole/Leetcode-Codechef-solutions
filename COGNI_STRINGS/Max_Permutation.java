package COGNI_STRINGS;

public class Max_Permutation {
    public static void main(String[] args) {
        
    }

    public static long factorial(int n){
        long fact=1;
        for(int i=2;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static long maxPermutation(String []arr,int N){
        int maxLen=0;
        for(String s:arr){
            String noVowels=s.replaceAll("(?i)[aeiou]", "");
            maxLen=Math.max(maxLen,noVowels.length());
        }

        return maxLen==0?0:factorial(maxLen);
    }
}

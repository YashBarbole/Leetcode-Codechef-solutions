package COGNI_STRINGS;

public class Vowel_Permutation {
    public static void main(String[] args) {
        String s="ABC";
        System.out.println(Vowel_permu(s));
    }
     public static long factorial(int n){
        long fact=1;
        for(int i=2;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static long Vowel_permu(String s){
        int consonants=0;
        for (char c:s.toCharArray()){
            if(!"AEIOUaeiou".contains(String.valueOf(c)))consonants++;
        }
        return consonants==0?0:factorial(consonants);
    }
}

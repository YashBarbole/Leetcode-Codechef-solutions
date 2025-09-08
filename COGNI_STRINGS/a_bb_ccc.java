package COGNI_STRINGS;

public class a_bb_ccc{
    public static void main(String[] args) {
        String ans="abd";
        System.out.println(expandString(ans));
    }

    static String expandString(String s){
        StringBuilder res= new StringBuilder();
        int [] firstOcc= new int[26];
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            int index=ch-'a';

            if(firstOcc[index]==0){
                firstOcc[index]=i+1;
            }

            if(i>0){
                res.append("-");
            }

            int repeatCount=firstOcc[index];
            for(int j=0;j<repeatCount;j++){
                res.append(ch);
            }
        }
        return res.toString();


    }
}

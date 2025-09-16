package COGNI_STRINGS;

public class MIN_CONV_XY {
    public static void main(String[] args) {
        
    }

    public static int MinConv(String s){
        int n=s.length();
        int diff1=0;
        int diff2=0;

        for (int i = 0; i < n; i++) {
            char expected1=(i%2==0)?'X':'Y';
            char expected2=(i%2==0)?'Y':'X';

            if(s.charAt(i)!=expected1)diff1++;
            if(s.charAt(i)!=expected2) diff2++;
        }
        return Math.min(diff1,diff2);
    }
}

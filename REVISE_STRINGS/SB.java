package REVISE_STRINGS;

public class SB {
    public static void main(String[] args) {
        StringBuilder bd= new StringBuilder();
         for(int i=0;i<26;i++){
            char ch =(char)('a'+i);
            bd.append(ch);
        }
        System.out.println(bd);
        bd.reverse();
        System.out.println(bd);
    }
}

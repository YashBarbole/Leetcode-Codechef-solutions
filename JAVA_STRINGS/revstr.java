package JAVA_STRINGS;

public class revstr {
    public static void main(String[] args) {
        String str="YASH";

        char ch[]= str.toCharArray();
        char temp[]= new char[ch.length];
        for(int i=ch.length-1;i>=0;i--){
           temp[ch.length-1-i]=ch[i];
        }
        System.out.println(temp);
    }

}

package corejava;

public class stringcompare {
    public static void main(String[] args) {
        String a="yash";
        String b="yash";

        System.out.println(a==b);

        String c= new String("yash");
        String d= new String("yash");

        System.out.println(c==d);

        String name1= new String("yashhhh");
        String name2= new String("yashhhh");

        System.out.println(name1.equals(name2));

        System.out.println(name1.charAt(2));
    }
    
}

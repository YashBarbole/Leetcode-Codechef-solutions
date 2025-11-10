package corejava.comparing;

public class Main {
    public static void main(String[] args) {
        Student2 yash= new Student2 (22, 98.22f);
        Student2 raj = new Student2(2, 55.2f);

        if(yash.compareTo(raj)>0){
            System.out.println("yash has more marks");
        }
        else{System.out.println("raj has more marks");}
    }
    
}

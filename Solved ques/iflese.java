import java.util.Scanner;

public record iflese() {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int n=sc.nextInt();

    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print("* ");
        }
         System.out.println();
       
        }
    }  
}

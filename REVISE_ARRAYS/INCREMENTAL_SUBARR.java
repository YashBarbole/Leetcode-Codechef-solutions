import java.util.Scanner;

public class INCREMENTAL_SUBARR {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int nn = sc.nextInt(); 
            int mm = sc.nextInt(); 
            int[] fav = new int[mm];
            for (int i = 0; i < mm; i++) fav[i] = sc.nextInt();

            int count = 0;
          
            for (int k = mm; k <= nn; k++) { 
                boolean ok = true;
                for (int i = 0; i < mm; i++) {
                    if (fav[i] != i + 1) { 
                        ok = false;
                        break;
                    }
                }
                if (ok) count++;
            }

            System.out.println(count);
        }
    }
}
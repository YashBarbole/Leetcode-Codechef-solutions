package COGNI_STRINGS;

import java.util.Scanner;

public class UNIQUE_MAPPINGS {
   public static int countMappings(String S) {
int count = 0;
for (int i = 0; i < S.length(); i++) {
int num1 = S.charAt(i) - '0';
if (num1 >= 1 && num1 <= 26) count++;
if (i + 1 < S.length()) {
int num2 = Integer.parseInt(S.substring(i, i + 2));
if (num2 >= 1 && num2 <= 26) count++;
}
}
return count;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String S = sc.nextLine();
System.out.println(countMappings(S));
}

    
}

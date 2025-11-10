package corejava;

import java.util.ArrayList;
import java.util.Scanner;

public class twodarrays {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    ArrayList<Integer> list=new ArrayList<>(5);
    // list.add(67);
    // list.add(672);
    // list.add(67);
    // list.add(674);
    // list.add(675);
   
    for(int i=0;i<5;i++){
        list.add(in.nextInt());
    }
   for(int i=0;i<5;i++){
    System.out.println(list.get(i));
        }      
    }
    
}

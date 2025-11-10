package corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class array_list {
    
    public static void main(String[] args) {
   List<Integer> list= new ArrayList<>();
   list.add(20);
   list.add(22);
   list.set(1, 21);
   System.out.println(list);

   List<String> list2= new ArrayList<>();

   list2.add("mango");
    list2.add("mango");
     list2.add("mango");
      list2.add("mango");
    }
}

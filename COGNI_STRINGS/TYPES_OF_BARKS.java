package COGNI_STRINGS;
import java.util.Set;
import java.util.HashSet;
import java.util.HashSet;

public class TYPES_OF_BARKS {
    public static void main(String[] args) {
        
    }

    public static int types(String s){
        String [] parts=s.split("\\.+");
        Set<Integer>barktypes= new HashSet<>();

        for(String part:parts){
            if(!part.isEmpty()){
                barktypes.add(part.length());
            }
        }
        return barktypes.size();
    }
}

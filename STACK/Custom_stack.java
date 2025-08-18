package STACK;

public class Custom_stack {
   protected int [] data;
   private static final int DEFAULT_SIZE=10;

    int ptr=-1;
    public Custom_stack(int size){
        this.data= new int [size];
   }
   
   public Custom_stack(){
    this(DEFAULT_SIZE);
   }

   public boolean push(int item){
    if(isFUll()){
        System.out.println("full stakc");
        return false;
    }

    ptr++;
    data[ptr]=item;
    return true;
   }


    public boolean isFUll(){
    return ptr==data.length-1;
   }

    private boolean isEmpty(){
    return ptr==-1;
   }



   public int Pop() throws Exception{
    if(isEmpty()){
        throw new Exception("cant pop from empty");
    }
    int removed= data[ptr];
    ptr--;
    return removed;
   }

   public  int Peak() throws Exception{
    if(isEmpty()){
        throw new Exception("cant peak from emtpy stack");
    }
    return data[ptr];
   }
}

package STACK;

public class Dynamic extends Custom_stack {
    public Dynamic(){
        super();//it will call customstack
    }

    public Dynamic(int size){
            super();
    }

    @Override
    public boolean push (int item){
        if(this.isFUll()){
            int [] temp= new int [data.length*2];
            //copy all prev in new 

            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        //insert item
        return super.push(item);
    }

}

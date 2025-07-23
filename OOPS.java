public class OOPS {
    public static void main(String[] args) {
        dog d1= new dog ();//new object created
        d1.name="sheru";
        d1.bark();
        dog d2 =new dog();
        d2.name="rambo";
        d2.walk();

        
    }
    
}


class dog{
    String name;
    int age;
    String color;

    void walk(){
        System.out.println(name+" is walking");
    }

    void bark(){
        System.out.println(name+" is barking");
    }



}

class cat{

}
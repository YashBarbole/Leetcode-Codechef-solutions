package corejava.comparing;

public class Student2 implements Comparable<Student2>{
    int rollno;
    float marks;

    public Student2(int rollno,float marks){
        this.rollno=rollno;
        this.marks=marks;
    }

    @Override
    public int compareTo(Student2 o){
        int diff= (int)(this.marks-o.marks);
        return diff;
    }
    
}


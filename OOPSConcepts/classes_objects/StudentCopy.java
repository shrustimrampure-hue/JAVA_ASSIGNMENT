package OOPSConcepts.classes_objects;

public class StudentCopy {
    String name;
    int usn;
    StudentCopy(String name,int usn){
        this.name=name;
        this.usn=usn;
    }
    StudentCopy(StudentCopy s){
        this.name=s.name;
        //this.name= new name(s) it is deep copy
        this.usn=s.usn;
    }
    void display(){
        System.out.println(name +" "+usn);
    }
}
class ex{
    public static void main(String[] args) {
        StudentCopy s1=new StudentCopy("Ashank",123);
        //StudentCopy s2=s1; doesnt create memory
         StudentCopy s2=new StudentCopy(s1);// create memory separately for s2 in RAM(HEAP)r
        s1.display();// Ashank 123
        s2.display();// Ashank 123(clone or copied)
    }//this is a shallow copy because somewhere it is related to s1
    //in deep copy it will not be related
}


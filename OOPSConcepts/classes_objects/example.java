package OOPSConcepts.classes_objects;

public class example {
    String name;
    int usn;
    char sec;
    public example(String name,int u,char s){
        this.name=name;
        usn=u;
        sec=s;
    }
    void print(){
        System.out.printf("Student Name: %s\t\n",this.name);
        System.out.println("USN: "+usn);
        System.out.println("Section:\t"+sec);
    }
}
class Student{
    public static void main(String[] args) {
        example s1=new example("Shrusti",102,'B');
        example s2 = new example("Vachana",55,'E');
        s1.print();
        s2.print();
    }
}

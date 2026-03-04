package OOPSConcepts.classes_objects;

public class DefaultConstructor {
    void print() {
        System.out.println("I am a constructor!!");
    }
}
class Hi{
    public static void main(String[] args) {
        DefaultConstructor d1=new DefaultConstructor();
        DefaultConstructor d2=new DefaultConstructor();
        d1.print();
        d2.print();
    }
}
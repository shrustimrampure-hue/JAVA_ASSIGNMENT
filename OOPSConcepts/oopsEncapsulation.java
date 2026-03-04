package OOPSConcepts;

public class oopsEncapsulation {
    private String name;
    private int usn;
    oopsEncapsulation(String s,int u){
        name=s;usn=u;
    }
    // getter and setter
    String getName(){
        return name;
    }
    void setName(String nn){
        name=nn;
    }
    // only by setter u can modify
    void print(){
        System.out.println("NAME: "+name+"\t and usn: "+usn);
    }
    // only for name getter and usn when u make private u cant change through this u can create
}
class Student{
    public static void main(String[] args) {
        oopsEncapsulation o=new oopsEncapsulation("shrusti",102);
        //o.name="Ashank"; not possible because name is private now throgh setter u can modify
        o.print();
        o.setName("Preethi");
        o.print();
        System.out.println("name is: "+o.getName());

    }
}

package OOPSConcepts.Inhertiance;
// use of super keyword

public class Person {
    String FullName;
    String LastName;
    Person(String fname,String lname){
        FullName=fname;
        LastName=lname;

        }
    }

class Student extends Person {
    int usn;
    Student(String FullName,String LastName,int u){
        super(FullName,LastName);//calling parent constructor
        usn=u;
    }
}
class exx{
    public static void main(String[] args) {
        //Person p=new Person("Shrusti","Rampure");
        Student s1=new Student("Shrusti","Rampure",102);


    }
}


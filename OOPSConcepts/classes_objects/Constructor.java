package OOPSConcepts.classes_objects;

public class Constructor {
    Constructor() {
        System.out.println("I am a constructor!!");
    }
}
class Hello{
    public static void main(String[] args) {
        Constructor d1=new Constructor();
        Constructor d2=new Constructor();
    }
}

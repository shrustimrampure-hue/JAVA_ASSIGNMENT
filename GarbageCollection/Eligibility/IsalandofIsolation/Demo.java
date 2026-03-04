package GarbageCollection.Eligibility.IsalandofIsolation;

public class Demo {
    Demo ref;// variable of its own class type why? because of pointer
}
class Driver{
    public static void main(String[] args) {
        Demo obj1= new Demo();
        Demo obj2=new Demo();
        obj1.ref=obj2;
        obj2.ref=obj1;
        obj1.ref=null;
        obj2.ref=null;
        //just imagination
    }
}


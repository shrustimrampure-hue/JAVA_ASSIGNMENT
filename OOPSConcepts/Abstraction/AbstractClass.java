package OOPSConcepts.Abstraction;
abstract class AAnimal{
    AAnimal(){
        System.out.println("Animal Constructor ");
    }
    abstract void sound();
}
class DDog extends AAnimal{
    DDog(){
        System.out.println("Dog Constructor");
    }
    void sound(){
        System.out.println("Dog Breaks");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        DDog d = new DDog();// here first AAnimal constructor is printed because it is parent of DDog
        d.sound();
        //constructor is supported due to inheritance
    }
}
/* Why does Abstract class have Constructor
-> Constructor are used for initializing common data!
->When a child class object is created, the Parent class
  Constructor run first
->Parent Constructor is getting exceuting because inheritance not due to object creation
 */

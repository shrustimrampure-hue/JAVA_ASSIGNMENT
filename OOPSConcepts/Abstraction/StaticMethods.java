package OOPSConcepts.Abstraction;

abstract class Animal {
    static void info(){//static method
        System.out.println("Animals are living beings");
    }

}
class Dog extends StaticMethods{
    void sound(){
        System.out.println("Dog Braks");
    }
}
public class StaticMethods{
   public static void main(String[] args) {
        Animal.info();//static method no need of object creation
        Dog d =new Dog();
        d.sound();
    }
}


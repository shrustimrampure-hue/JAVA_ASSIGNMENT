package OOPSConcepts.Abstraction;
abstract class AbstractAnimal {
    /*AbstractAnimal{ }
    String name;
    AbstractAnimal(){//Called first
        name="XYZ";
    }*/
    //Partially hidden
    abstract void sound();// abstract cant have body
    //static void run (no need of objects)
    void run(){
        System.out.println("Running...");
    }
}
class Lion extends AbstractAnimal{
    void sound() {// function overriding
        // can not skip this method
        // forcefully trying child to inhert the function and define
        System.out.println("Roars");
    }
}
class Cat extends AbstractAnimal{
    void sound(){
        System.out.println("Meow");
    }
}
class Driver{
   public static void main(String[] args) {
       //void run();
        Lion l=new Lion();
        l.run();
        l.sound();
       Cat c =new Cat();
       c.run();
       c.sound();
    }
}




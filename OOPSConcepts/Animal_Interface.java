package OOPSConcepts;

public interface Animal_Interface
{
    void sound();// default abstract method
    void run();// default abstract method
    // void null{ } not allowed because of abstract
}
class Lion implements Animal_Interface{
    public void sound(){
        System.out.println("Roar");
    }
    public void run(){
        System.out.println("Running");
    }
}
class Animal{
    public static void main(String[] args) {
        Lion l=new Lion();
        l.sound();
        l.run();
    }
}
// Program to know interface
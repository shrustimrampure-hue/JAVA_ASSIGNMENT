package OOPSConcepts.Inhertiance;
// multi level

public class Animal {
    void eat() {
        System.out.println("Eating....");
    }
}
    class Lion extends Animal{
        void roar(){
            System.out.println("Roaring....");
        }

}
class BabyLion extends Lion{
    void cry(){
        System.out.println("Crying.....");
    }
}
class Dog{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        Lion l=new Lion();
        l.roar();
        l.eat();
        BabyLion bl=new BabyLion();
        bl.cry();
        bl.roar();
        bl.eat();
    }
}

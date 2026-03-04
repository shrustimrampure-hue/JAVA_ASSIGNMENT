package OOPSConcepts;

public interface Default_interface {
    void start();
    default void stop(){
        System.out.println("Engine stopped");
    }
}
class BMW implements Default_interface{
    public void start(){
        System.out.println("BMW started");
    }
}
class Audi implements Default_interface{
    @Override
    public void start() {
        System.out.println("Audi started");
    }
}
class Benz implements Default_interface{
    @Override
    public void start() {
        System.out.println("Benz started");
    }
}
class Interface{
    public static void main(String[] args) {
        BMW b=new BMW();// 1st method to access deafault
        b.start();
        b.stop();
        Audi a = new Audi();
        a.start();
        a.stop();
        Benz bz=new Benz();
        bz.start();
        bz.stop();
        Default_interface d= new BMW();// upacast 2method
        d.start();
        d.stop();

    }
}


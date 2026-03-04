package OOPSConcepts;

public interface Ways_of_using_Default {
    default void stop(){
        System.out.println("Engine Stopped");
    }
}
class car implements Ways_of_using_Default{
    void carFunction(){
        System.out.println("CarFunction");
    }
}
class call implements Ways_of_using_Default{
    public void stop(){
        System.out.println("Call stopped");
    }
}
class Innn{
    public static void main(String[] args) {
        car c =new car();//method1 to access default
        c.stop();
        c.carFunction();//waste
        Ways_of_using_Default w=new car();//upcasting method2
        c.stop();
        call ww=new call();
        //Ways_of_using_Default ww=new call();//rewriting  method3
        ww.stop();

    }
}

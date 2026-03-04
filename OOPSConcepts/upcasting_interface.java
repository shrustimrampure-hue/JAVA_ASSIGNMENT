package OOPSConcepts;

public interface upcasting_interface {
    void ride();//default can be overriding
}
class ccar implements upcasting_interface{
   public void ride(){
       System.out.println("Car riding");
    }
}
class bbike implements upcasting_interface{
    public void ride(){
        System.out.println("Bike riding");
    }
}
class IInterface{
    public static void main(String[] args) {
        upcasting_interface cc=new ccar();
        cc.ride();
        upcasting_interface bb=new bbike();
        bb.ride();

    }
}
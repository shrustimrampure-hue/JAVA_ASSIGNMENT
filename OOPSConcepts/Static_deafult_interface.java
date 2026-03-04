package OOPSConcepts;

public interface Static_deafult_interface {// we can not create objects to interface
    void show();// abstract method
    default void display(){
        System.out.println("Default method");
    }// through default we can define
    static void message(){
        System.out.println("Static Method");
    }
}//through static we can define in interface
class Child implements Static_deafult_interface{
    public void show(){// without using public i cannot access it by default it will become deafult
        System.out.println("Showing");
    }
}
class Driver{
    public static void main() {
        Child c=new Child();
        c.show();
        c.display();// it will take from parent
      Static_deafult_interface.message();
    }
}

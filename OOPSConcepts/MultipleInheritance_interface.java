package OOPSConcepts;

 interface Mom {
     default void cook(){
         System.out.println("Indian");
     }
}
interface Dad{
     default void cook(){
         System.out.println("Chinese");
     }
}
class Daughter implements Mom,Dad{
     @Override
     public void cook(){
         System.out.println("Italin");
         Dad.super.cook();
         Mom.super.cook();
     }
}
public class MultipleInheritance_interface{
     public static void main(String[] args) {
         Daughter d=new Daughter();
         d.cook();
     }
}

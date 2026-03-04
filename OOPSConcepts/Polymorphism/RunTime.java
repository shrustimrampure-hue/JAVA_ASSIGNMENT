package OOPSConcepts.Polymorphism;
// Over ridding
 class Dad {
  void cook(){
   System.out.println("Indian");
  }
}
class Daughter extends Dad{
  void cook(){
   System.out.println("Chinese");
  }
}
public class RunTime{
 public static void main(String[] args) {
  Dad d =new Dad();
  Daughter da = new Daughter();
  d.cook();
  da.cook();
 }
}
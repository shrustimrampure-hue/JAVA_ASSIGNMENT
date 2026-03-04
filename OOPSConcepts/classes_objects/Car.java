package OOPSConcepts.classes_objects;

 public class Car{
  String BrandName;
  int ManuDate;
  String Color;
  public Car(String BrandName,int MDate,String C){
   this.BrandName=BrandName;
   ManuDate= MDate;
   Color=C;
  }
  void printDetails(){
   System.out.printf("Car BrandName is %s \n",this.BrandName);
   System.out.println("Car manufacturing date is \n"+ManuDate);
   System.out.println("Car color is: \n"+Color);

  }
}
class Object{
 public static void main() {
  Car c1=new Car("Audi",2000,"Red");
  Car c2=new Car("BMW",2001,"Blue");
  c1.printDetails();
  c2.printDetails();
  //c1.BrandName="Marthhi"; avoid this make private atrributes eg private string brandname

 }
}

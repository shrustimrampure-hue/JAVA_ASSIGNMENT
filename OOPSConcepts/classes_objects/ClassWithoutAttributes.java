package OOPSConcepts.classes_objects;

 class Demo {
     void printDemo(){
         System.out.println("Demo......");
     }
}
class Driver{
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.printDemo();
    }
}

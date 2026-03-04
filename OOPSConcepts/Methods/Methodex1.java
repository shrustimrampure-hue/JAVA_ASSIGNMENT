package OOPSConcepts.Methods;

public class Methodex1 {
    int add(int a,int b){
        return a+b;
    }

   public static void main(String[] args) {
        Methodex1 obj=new Methodex1();
       int s= obj.add(10,20);
       System.out.println(s);
    }

}

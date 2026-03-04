package OOPSConcepts.Polymorphism;

public class CompileTime {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
}
class Driver{
    public static void main(String[] args) {
        CompileTime c=new CompileTime();
        System.out.println(c.add(1,2));
        System.out.println(c.add(1,2,3));
        System.out.println(c.add(2.1,2.2));
    }
}
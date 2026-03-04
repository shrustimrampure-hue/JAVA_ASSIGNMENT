package OOPSConcepts.Abstraction;

abstract class Realistic_Example_Bank {
    String branch;
    Realistic_Example_Bank(String branch){
        this.branch=branch;
        System.out.println("Branch is "+branch);
    }
    abstract void CalculateInterest();
}
class HDFC extends Realistic_Example_Bank{
    HDFC(String branch){
        super(branch);//calls parent constructor
    }
    void CalculateInterest(){
        System.out.println("100% Interest");
    }
}
class Main{
    public static void main(String[] args) {
        HDFC h = new HDFC("RRNagar");
        h.CalculateInterest();

    }
}
//Overriding must be done in abstraction

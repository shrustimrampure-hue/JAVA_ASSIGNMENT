package ExceptionHandling;

public class EX_BANK {
    public static void main(String[] args) {
        try{
            int balance=2000;
            int withdraw=3000;
            if(withdraw>balance){
                throw new ArithmeticException("Insufficient Balance ");
            }
            System.out.println("Withdraw Successfully ");
        }catch(ArithmeticException e){
            System.out.println("Exception Caught: "+e.getMessage());
        }
    }
}

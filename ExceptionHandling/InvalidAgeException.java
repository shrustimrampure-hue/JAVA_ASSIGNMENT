package ExceptionHandling;
// custom exceptions
public class InvalidAgeException extends Exception { // checked exception
//public class InvalidAgeException extends RuntimeException unchecked exception
    InvalidAgeException(String msg){
        super(msg);
    }
}
class Driver{
    static void vote(int age)throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be over 18!");//constructor call
        }
        System.out.println("You can Vote");
    }
//    public static void main(String[] args) throws Exception{
//        vote(25);
    public static void main(String[] args) {
        try{
            vote(17);
            //vote(25); can not handle because only once
    }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}

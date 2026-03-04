package ExceptionHandling;

public class Throws {
    static void checkAge(int age){
        if(age>=18){
            System.out.println("Eligible- Access Granted");
        }else{
            throw new RuntimeException("Not Eligible- Access");
        }
    }
    public static void main(String[] args) {
       // checkAge(12);
        checkAge(25);
    }
}

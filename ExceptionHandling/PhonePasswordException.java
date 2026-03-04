package ExceptionHandling;

public class PhonePasswordException extends Exception {
    PhonePasswordException(String pas){
        super(pas);
    }
}
class hello{
    static void check(String pas) throws PhonePasswordException{
        if(pas=="Shrusti"){
            System.out.println("Password is correct ");
        }
        else
        System.out.println("Password is incorrect");
    }
    public static void main(String[] args)throws PhonePasswordException {
        check("Shrusti");
    }
}


package ExceptionHandling;

public class Exceptions {
    public static void main(String[] args) {
        int i,j,k=0;
        i = 10;
        j=2;
        try{
            k=i/j;
            System.out.println(k);//here if exception occurs left is not executed directly it will go to catch and handle it
            int arr[] = {1,2,3,4,5};
            System.out.println(arr[10]);
        }catch(ArithmeticException e){
            System.out.println("Undefined");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }catch(Exception e){//When you do not know the exception
            System.out.println("Unknown Exception");
        }
        finally{
            System.out.println("Finally will be executed no matter what!");
        }
    }static{// will executed even outside the main and first executed before main
        System.out.println("Execution started");
        //not part of exception handling
    }

}
/* try-catch is used because it continues execution even if exceptions is used
 if you will not use then when exceptions is caused program stops there only
 */
/* execution before main to handle exception
static{
try{
}catch // i want to handle before main program
 */
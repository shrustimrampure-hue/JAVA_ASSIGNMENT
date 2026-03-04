package ExceptionHandling;

public class multi_catch {
    public static void main(String[] args) {
        int i, j, k = 0;
        i = 10;
        j = 0;
        try {
            k = i / j;
            System.out.println(k);
            /*int arr[] = {1,2,3,4,5};// use different try to handle only one exception is handled
            System.out.println(arr[10]);*/
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}

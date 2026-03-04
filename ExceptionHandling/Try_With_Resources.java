package ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Try_With_Resources {
    public static void main(String[] args)throws Exception {
        String strr;
        BufferedReader br=null;
        try( BufferedReader brr=new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter something");
            strr=brr.readLine();
            System.out.println("You Entered: "+strr);
        }
    }
}
//no need to close manually
package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerVsBufferedReaderClass {
    //BufferedReader if you dont use throws error occurs in readline
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String ss=br.readLine();
        int a=Integer.parseInt(ss);//give input in number not string
        //integers is like objects
     // we cant give input as int only string it will not accepted
    //Scanner class
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
    }
}

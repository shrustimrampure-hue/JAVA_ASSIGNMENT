package ExceptionHandling;

import java.io.IOException;

//Exception Propagation
public class Checked_Exception {
    static void read_file() throws IOException{
        throw new IOException("File not found");//manually throwing
    }
    static void display() throws IOException{
        read_file();
    }
    /*static void show() throws IOException{
        display();
    }*/
    public static void main(String[] args) {
        try{
            display();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
//throws is used for checked exception and written outside the function/method next to method signature
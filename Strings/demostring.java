package Strings;

public class demostring {
    public static void main(String[] args) {

        String str="Hello";
        str.concat("World");//String is immutable means once created we can not change no modification is allowed
        System.out.println(str);
        str =str.concat("World");
        System.out.println(str);
        String s1=new String("Hello");
        String s2= "Hello";
        String s3=new String("Hello");
        System.out.println(s1==s2);//false
        System.out.println(s1==s3);//true
        String s4=s1.intern( );//intern go and search in string pool
        System.out.println(s1==s4);//false it will check: s4 is in string pool and s1 is outside the string
        // intern() refers to value in string pool
        System.out.println(s2==s4);//true it will check: s4 is in string pool and s2 is inside the string
    }

}

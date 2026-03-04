package Strings;
// Strings are immutable
public class String_Operation {
    public static void main(String[] args) {
        // creating String
        String s1="Java Programming";
        String s2=new String("Java Programming");
        System.out.println("Original String: "+s1);
        //length
        System.out.println("Length is: "+s1.length());
        //charAt
        System.out.println("Character at index 2: "+s1.charAt(2));
        //UPPERCASE
        System.out.println("UPPER CASE: "+s1.toUpperCase());
        //LOWERCASE
        System.out.println("lower case: "+s1.toLowerCase());
        //equals() compare string literal value and == compare reference (address)
        System.out.println("Equals to(value comparing): "+s1.equals(s2));
        System.out.println(" == (compares address): "+(s1==s2));
        System.out.println(" == (compares address): "+ s1==s2);// it is mathematical operation its just replaces answer without knowing what to do
        //compareTo() done lexical graphical(means ascii value)
        //positive string1  is greater than s2 -ve s2 is greater than s1 0 means properly divides lexical value is same
        System.out.println("Compare To('Java Programming' with 'Java Programming'):"+s1.compareTo(s2));
        String check1="Programming";
        System.out.println("Comparing 'Java Programming' with 'Programming's1.check1): "+s1.compareTo(check1));
        System.out.println("Comparing 'Java Programming' with 'Programming'check1.s1): "+check1.compareTo(s1));
        String check2="Java Programming Language";
        System.out.println("Comparing 'Java Programming' with 'Java Programming Language'): "+s1.compareTo(check2));
        String check3="java";
        System.out.println("Comparing 'Java Programming' with 'java'): "+check3.compareTo(s1));
        //sustring() 0-4
        System.out.println("Substring between 0-4: "+s1.substring(0,4));
        System.out.println("Substring between 0-7: "+s1.substring(0,7));
        System.out.println("Substring between 1-7: "+s1.substring(1,7));
        //contains() checks it is a part or not
        System.out.println("Contains Program: "+s1.contains("Program"));
        //indexOf()
        System.out.println("Index of 'a': "+s1.indexOf('a'));
        //replace()
        System.out.println("Replace Java with Python:"+s1.replace("Java","Python"));
        System.out.println(s1);
        //s1=s1.replace("Java","Python");
        //startWith() and endWith()
        System.out.println("Start with Java: "+s1.startsWith("Java"));
        System.out.println("Ends with mming: "+s1.endsWith("mming"));
        //trim() automatically trimes the white space
        String s3 ="      Shrusti     ";
        System.out.println("Before trim: "+s3);
        System.out.println("After trim: "+s3.trim());
        //concat()
        System.out.println("Concat(): "+s1.concat(" Language"));
        //isEmpty()
        String str="";
        System.out.println("Is empty'': "+str.isEmpty());
        String strr=" ";
        System.out.println("Is emptyy'  ': "+strr.isEmpty());
        //split()
        String sentence="Java is a very easy Language to learn!";
        String[] arr=sentence.split(" ");
        System.out.println("After split:");
        for(String i: arr){// for each to iterate
            System.out.println(i);
        }
    }
}


package ExamplePrograms;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m1,m2,m3,m4,m5;

        System.out.println("Enter subject1 marks:");
        m1=sc.nextInt();
        System.out.println("Enter subject2 marks:");
        m2=sc.nextInt();
        System.out.println("Enter subject3 marks:");
        m3=sc.nextInt();
        System.out.println("Enter subject4 marks:");
        m4=sc.nextInt();
        System.out.println("Enter subject5 marks:");
        m5=sc.nextInt();
        double total = m1+m2+m3+m4+m5;
        System.out.println("Total Marks out of 500 is "+total);
        double percentage = (total/500)*100;
        System.out.println("Percentage:"+percentage);
        if(percentage>=75) {
            System.out.println("Grade A");
        }
        else if(percentage>=50){
            System.out.println("Grade B");
        }
        else if(percentage>=35){
            System.out.println("Grade C");
        }
        else {
            System.out.println("Fail");
        }

    }
}
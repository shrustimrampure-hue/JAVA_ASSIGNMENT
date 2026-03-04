package ExamplePrograms.Patterns;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size=sc.nextInt();
        for (int i = 1; i <=size; i++) {
            for (int stars = 1; stars <=i; stars++) {
                System.out.print("*");
            }
            for (int spaces = 2*i; spaces < 2 *size; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <=i; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = size; i >=0; i--) {
            for (int stars = 1; stars <=i; stars++) {
                System.out.print("*");
            }
            for (int spaces = 2*i; spaces < 2 *size; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <=i; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

package ExamplePrograms;

public class Pattern {
    public static void main(String[] args) {
        for (int i = 5-2; i>=0; i--) {
            for (int j = 0; j < 5 - i - 1; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}

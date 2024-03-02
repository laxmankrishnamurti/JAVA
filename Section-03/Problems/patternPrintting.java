import java.util.Scanner;

public class patternPrintting {
    public static void main(String[] args) {
        // firstTriangle();
        // secondTriangle();
        thirdTriangle();
    }

    // public static void firstTriangle() {
    // System.out.println("Enter Row number of the pattern : ");
    // Scanner input = new Scanner(System.in);
    // int number = input.nextInt();

    // int i = 0;
    // while (i < number) {
    // int column = 0;
    // while (column < i) {
    // System.out.print(" * ");
    // column++;
    // }
    // System.out.println("\n");
    // i++;
    // }

    // input.close();
    // }

    // public static void secondTriangle() {
    // System.out.println("Enter Row number of the Pattern : ");
    // Scanner input = new Scanner(System.in);
    // int row = input.nextInt();

    // int i = 0;
    // while (i < row) {
    // int column = 0;
    // while (column < (row - i)) {
    // System.out.print(" * ");
    // column++;
    // }
    // System.out.println("\n");
    // i++;
    // }

    // input.close();
    // }

    public static void thirdTriangle() {
        System.out.println("Enter row number : ");
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();

        int i = 1;
        while (i <= row) {
            int space = (row - i);
            while (space > 0) {
                System.out.print(" ");
                space--;
            }

            int column = 0;
            while (column < i) {
                System.out.print("*");
                column++;
            }

            System.out.println("\n");
            i++;
        }
        input.close();
    }

}

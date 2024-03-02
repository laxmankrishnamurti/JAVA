import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        findFactorial();
    }

    public static void findFactorial() {
        System.out.println("Enter the number :");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int factorial = 1;
        int i = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial is : " + factorial);
        input.close();
    }
}

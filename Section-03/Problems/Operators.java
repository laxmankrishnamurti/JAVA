import java.util.Scanner;

public class Operators {
    // public static void main(String[] args) {
    // // printTable(29);
    // // System.out.println("Sum of all odd numbers is : " + addOddSum(5));
    // // System.out.println("Factorial is :" + factorial());
    // }

    /* Print multiplication table for a given number */

    // public static void printTable(int num) {
    // System.out.println("Table starts from here!!!");
    // int i = 1;
    // while (i <= 10) {
    // System.out.println(num * i);
    // i++;
    // }
    // }

    /* To sum all odd numbers from 1 to N. */

    // public static int addOddSum(int num) {
    // int i = 1;
    // int sum = 0;
    // while (i <= num) {
    // if (i % 2 != 0) {
    // sum += i;
    // }
    // i++;
    // }
    // return sum;
    // }

    /* Calculates the Factorial of a given number. */

    // public static float factorial() {
    // System.out.println("Enter the number that you want Factorial : ");
    // Scanner input = new Scanner(System.in);
    // int num = input.nextInt();

    // float factorial = 1;
    // while (num > 0) {
    // factorial *= num;
    // num--;
    // }
    // input.close();
    // return factorial;
    // }

    /* Sum of the input number's digits */

    public static void main(String[] args) {
        sumDigits();
    }

    public static void sumDigits() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = input.nextInt();

        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }

        System.out.println("Sum of the input's digit is : " + sum);

        input.close();
    }

}
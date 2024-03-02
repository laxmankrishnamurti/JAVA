import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        inputs();
    }

    // Armstrong Number :: An n-digit number is considered an Armstrong number if
    // the sum of its digits, each raised to the power of n, is equal to the number
    // itself.

    public static void inputs() {
        System.out.println("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int digits = checkDigits(number);
        int sum = sumOfDigits(number, digits);
        check(number, sum);
        input.close();
    }

    public static int checkDigits(int number) {
        int digit = 0;
        while (number != 0) {
            number /= 10;
            digit++;
        }

        return digit;
    }

    public static int sumOfDigits(int number, int power) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, power);
            number /= 10;
        }

        return sum;
    }

    public static void check(int number, int sum) {
        if (number == sum) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }

}

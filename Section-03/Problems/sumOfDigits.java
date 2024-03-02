import java.util.Scanner;

public class sumOfDigits {

    public static void main(String[] args) {
        digitsSum();
    }

    public static void digitsSum() {
        System.out.println("Enter number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            number /= 10;
            sum += digit;
        }

        System.out.println("Sum of the input number's digit is :" + sum);
        input.close();
    }
}

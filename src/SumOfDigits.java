import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter the number ::");
        Scanner in = new Scanner(System.in);
        int inputNumber = in.nextInt();

        int sumOfDigits = 0;
        do {
            int digit = inputNumber % 10;
            sumOfDigits += digit;
            inputNumber /= 10;
        }while (inputNumber > 0);
        System.out.println("sum of input's value is : " + sumOfDigits);
    }
}

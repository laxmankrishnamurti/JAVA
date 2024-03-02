import java.util.Scanner;

public class palindromNumber {
    public static void main(String[] args) {
        inputs();
    }

    // A palindrome number is a number that remains the same when its digits are
    // reversed. In other words, a palindrome number reads the same forward and
    // backward. This property is not dependent on the numerical base; a number can
    // be a palindrome in any base.

    public static void inputs() {
        System.out.println("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int reverse = getReverse(number);
        check(number, reverse);
        input.close();
    }

    public static int getReverse(int number) {
        int answer = 0;
        while (number != 0) {
            int digit = number % 10;
            answer = (answer * 10) + digit;
            number /= 10;
        }

        return answer;
    }

    public static void check(int number, int reverse) {
        if (number == reverse) {
            System.out.println(number + " is a Palindrome Number");
        } else {
            System.out.println(number + " is not a Palindrome Number");
        }
    }

}

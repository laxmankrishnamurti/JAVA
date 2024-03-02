import java.util.Scanner;

public class reverseDigits {
    public static void main(String[] args) {
        inputs();
    }

    public static void inputs() {
        System.out.println("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int reverseNumber = reverse(number);
        System.out.println("Your reverse number is : " + reverseNumber);
        input.close();
    }

    public static int reverse(int number) {
        int answer = 0;

        while (number != 0) {
            int digit = number % 10;
            answer = (answer * 10) + digit;
            number /= 10;
        }

        return answer;
    }
}

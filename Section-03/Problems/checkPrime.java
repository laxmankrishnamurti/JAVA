import java.util.Scanner;

public class checkPrime {

    public static void main(String[] args) {
        inputs();
    }

    public static void inputs() {
        System.out.println("Enter the number which you want to check : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        boolean answer = check(number);
        System.out.println("Answer is : " + answer);
        if (answer) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }

        input.close();
    }

    public static boolean check(int number) {

        // Edge case
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

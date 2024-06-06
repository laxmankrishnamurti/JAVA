import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number which you want factorial value :: ");
        Scanner in = new Scanner(System.in);
        int inputNumber = in.nextInt();

        double factorial = 1;
        for( int i = 2; i <= inputNumber; i++){
            factorial *= i;
        }

        System.out.println("factorial of the input number is : " + factorial);
    }
}

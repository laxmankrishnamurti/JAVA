import java.util.Scanner;

public class sumOfOddNumbers {
    public static void main(String[] args) {
        oddSum();
    }

    public static void oddSum() {
        System.out.println("Enter Initial Point : ");
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        System.out.println("Enter end Point : ");
        int end = input.nextInt();

        int sum = 0;
        int i = start;
        while (i <= end) {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        }

        System.out.println("Sum of all Odd numbers is : " + sum);

        input.close();
    }
}

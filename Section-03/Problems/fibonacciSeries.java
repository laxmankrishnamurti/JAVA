import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        inputs();
    }

    public static void inputs() {
        System.out.println("How long you want the Fibonacci series: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        series(number);
        input.close();
    }

    public static void series(int number) {
        int pre = 0;
        int post = 1;
        System.out.print("Series start :: ");
        System.out.print(pre + " ");
        System.out.print(post + " ");

        int i = 1;
        while (i <= (number - 2)) {
            int nextNum = pre + post;
            pre = post;
            post = nextNum;
            System.out.print(nextNum + " ");
            i++;
        }

        System.out.println(" :: Series End");
    }
}

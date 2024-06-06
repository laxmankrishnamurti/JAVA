import java.util.Scanner;

public class SumOddByBitwise {
    public static void main(String[] args) {
        System.out.print("Enter initial point : ");
        Scanner in = new Scanner(System.in);
        int initialPoint = in.nextInt();
        System.out.print("Enter Final point : ");
        int finalPoint = in.nextInt();

        int sum = 0;
        for (int i = initialPoint; i <= finalPoint; i++){
            if ((i & 1) == 1){
                sum += i;
            }
        }
        System.out.println("Sum from initial to final point is : " + sum);
    }
}

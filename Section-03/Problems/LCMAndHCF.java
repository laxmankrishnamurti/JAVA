import java.util.Scanner;

public class LCMAndHCF {

    public static void main(String[] args) {
        findLCMandHCF();
    }

    public static void findLCMandHCF() {

        // Mistake :: Considering edge case is very important.

        System.out.println("Enter first number : ");
        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();
        System.out.println("Enter second number :");
        int secondNum = input.nextInt();

        int hcf = 1;
        int i = 1;
        while (i <= firstNum) {
            ++i;
            if (firstNum % i == 0 && secondNum % i == 0) {
                hcf = i;
            }
        }

        int lcm = (firstNum * secondNum) / hcf;

        System.out.println("HCF is : " + hcf);
        System.out.println("LCM is : " + lcm);

        input.close();

    }
}

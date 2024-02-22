import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        // Q :: Calculate the product of input floating numbers.

        // Scanner input = new Scanner(System.in);

        // System.out.println("Enter first floating number : ");
        // float num1 = input.nextFloat();
        // System.out.println("Enter second floating number : ");
        // float num2 = input.nextFloat();

        // float product = (num1 * num2);
        // System.out.println("Product of the Input numbers is : " + product);

        // input.close();

        // Q :: Calculate Perimeter of a Rectangle.

        // Scanner sides = new Scanner(System.in);
        // System.out.println("Enter AB : ");
        // float AB = sides.nextFloat();
        // System.out.println("Enter BC : ");
        // Float BC = sides.nextFloat();
        // System.out.println("Enter CD : ");
        // float CD = sides.nextFloat();
        // System.out.println("Enter DA : ");
        // float DA = sides.nextFloat();

        // float perimeter = (AB + BC + CD + DA);
        // System.out.println("Perimeter of the Rectange is : " + perimeter);

        // sides.close();

        // Q :: Calculate Simple Interest

        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter Principle values : ");
        // int principle = input.nextInt();
        // System.out.println("Enter Rate value : ");
        // int rate = input.nextInt();
        // System.out.println("Enter Time : ");
        // int time = input.nextInt();

        // float simpleInterest = ((principle * rate * time) / 100);
        // System.out.println("Simple Interest is :" + simpleInterest);

        // input.close();

        // Q :: Calculate Compount Interest.

        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter Principle amount : ");
        // int principle = input.nextInt();
        // System.out.println("Enter Rate : ");
        // double rate = input.nextDouble();
        // System.out.println("Enter Time period : ");
        // int time = input.nextInt();

        // double compoundInterest = principle * Math.pow((1 + rate / 100.0), time);
        // System.out.println("Compound Interest is : " + (compoundInterest -
        // principle));
        // input.close();

        // Q :: Convert Fahrenheit to Celcius

        Scanner temp = new Scanner(System.in);
        System.out.println("Enter Fahrenheit value : ");
        float farh = temp.nextFloat();
        float celcius = ((farh - 32) * 5 / 9);
        System.out.println("Celsius value is : " + celcius);

        temp.close();
    }
}

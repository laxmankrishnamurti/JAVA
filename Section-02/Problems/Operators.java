import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        /* Q :: Calculate the product of input floating numbers. */

        // Scanner input = new Scanner(System.in);

        // System.out.println("Enter first floating number : ");
        // float num1 = input.nextFloat();
        // System.out.println("Enter second floating number : ");
        // float num2 = input.nextFloat();

        // float product = (num1 * num2);
        // System.out.println("Product of the Input numbers is : " + product);

        // input.close();

        /* Q :: Calculate Perimeter of a Rectangle. */

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

        /* Q :: Convert Fahrenheit to Celcius */

        // Scanner temp = new Scanner(System.in);
        // System.out.println("Enter Fahrenheit value : ");
        // float farh = temp.nextFloat();
        // float celcius = ((farh - 32) * 5 / 9);
        // System.out.println("Celsius value is : " + celcius);

        // temp.close();

        /* Q :: Take two inputs and swap it */

        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter a : ");
        // int num1 = input.nextInt();
        // System.out.println("Enter b : ");
        // int num2 = input.nextInt();

        // int tempNum = num1;
        // num1 = num2;
        // num2 = tempNum;

        // System.out.println("Swapping Done.");
        // System.out.println("a : " + num1 + " b :" + num2);

        // input.close();

        /*
         * Create a Ticket discount program. The discount criteria as follow :-
         * 
         * - Female : 50%;
         * - age is less than 5 get 75% OFF
         * - age is greater than 60 get only 25% OFF
         */

        // Scanner input = new Scanner(System.in);
        // System.out.println("Is you are female (true/false) : ");
        // boolean isFemale = input.nextBoolean();
        // System.out.println("Please enter your age : ");
        // int age = input.nextInt();

        // if ((age < 5)) {
        // System.out.println("You get 75% OFF");
        // } else if (isFemale) {
        // System.out.println("You get 50% OFF");
        // } else if (age > 60) {
        // System.out.println("You only get 25% OFF");
        // } else {
        // System.out.println("Sorry! You don't get any discount");
        // }

        // input.close();

        /* Determine the greatest of the three numbers */

        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter a : ");
        // int a = input.nextInt();
        // System.out.println("Enter b : ");
        // int b = input.nextInt();
        // System.out.println("Enter c : ");
        // int c = input.nextInt();

        // if (a > b && a > c) {
        // System.out.println("a is the greatest one");
        // } else if (b > a && b > c) {
        // System.out.println("b is the gratest one");
        // } else if (c > a && c > b) {
        // System.out.println("c is the greatest one");
        // }

        // input.close();

        /* BITWISE OPERATOR */

        /* Q :: Pracice on Bitwise Operator */

        int num1 = 2;
        int num2 = 5;

        int AND = (num1 & num2); // 0010 & 0101 = 0000 = 0
        int OR = (num1 | num2); // 0010 | 0101 = 0111 = 7
        int XOR = (num1 ^ num2); // 0010 ^ 0101 = 0101 = 7
        int NOT = ~num1; // ~0010 = -3

        System.out.println("AND Value : " + AND);
        System.out.println("OR  Value : " + OR);
        System.out.println("XOR Value : " + XOR);
        System.out.println("NOT Value : " + NOT);

        // Shifting Value

        /**
         * Left Shifting = Value increased by 2x.
         * Right Shifting = Value decreased by 2x.
         * 
         * Note :: Shifting value is just any approximating value.
         */
    }
}

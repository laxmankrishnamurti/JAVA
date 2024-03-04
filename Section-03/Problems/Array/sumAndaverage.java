// import java.util.Scanner;

public class sumAndaverage {
    public static void main(String[] args) {
        int[] marks = { 98, 91, 95, 85, 76, 48, 36, 56, 63, 24, 52, 47, 66, 55, 99 };
        int sumValue = calculateSum(marks);
        int averageValue = calculateAverage(marks, sumValue);

        System.out.println("Sum of total marks is : " + sumValue);
        System.out.println("Average of marks is : " + averageValue);
    }

    public static int calculateSum(int[] marks) {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        return sum;
    }

    public static int calculateAverage(int[] marks, int sum) {
        int length = marks.length;
        int average = (sum / length);

        return average;
    }

}

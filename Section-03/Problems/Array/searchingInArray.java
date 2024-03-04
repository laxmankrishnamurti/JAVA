import java.util.Scanner;

public class searchingInArray {
    public static void main(String[] args) {
        int[] marks = { 98, 95, 97, 96, 69, 58, 48, 52, 35, 45, 79, 69, 99, 100 };
        int targetValue = inputs();

        int indexValue = findTarget(marks, targetValue);
        if (indexValue > 0) {
            System.out.println("The Target marks is Present!!!");
            System.out.println("The index value of the input marks is : " + indexValue);
        } else {
            System.out.println("Sorry!!! Input marks dosen't exist.");
        }
    }

    public static int inputs() {
        System.out.print("Enter the target value are you looking for : ");
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();

        input.close();
        return target;
    }

    public static int findTarget(int[] marks, int target) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == target) {
                return i;
            }
        }

        return 0;
    }

}

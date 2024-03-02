import java.util.Scanner;

public class multipleTables {
    public static void main(String[] args) {
        table();
    }

    public static void table() {
        System.out.println("Enter the Table number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println("Table Starts");
        int i = 1;
        while (i <= 10) {
            System.out.println(number * i);
            i++;
        }
        System.out.println("Table end");

        input.close();
    }
}

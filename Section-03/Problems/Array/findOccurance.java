import java.util.Scanner;

public class findOccurance {
    public static void main(String[] args) {
        inputs();        
    }   

    public static int inputs(){
        System.out.println("Enter the number you want to check it's occurance : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println("Your input number is : " + number);
        input.close();
        return number;
    }
}

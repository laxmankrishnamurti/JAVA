import java.util.Scanner;

public class findOccurance {
    public static void main(String[] args) {
        int[] marks = {1,8,4,3,4,9,7,12,14,4,8,9,12,6,4};        
        int occurance = findOccurances(marks);
        System.out.println("Occurance of the number is : " + occurance + " times");
    }   

    public static int inputs(){
        System.out.println("Enter the number you want to check it's occurance : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println("Your input number is : " + number);
        input.close();
        return number;
    }

    public static int findOccurances(int[] marks){
        int inputNumber = inputs();

        int checker = 0;
        for(int i = 0; i < marks.length; i++){
            if (marks[i] == inputNumber) {
                checker++;
            }
        }
        return checker;
    }

}

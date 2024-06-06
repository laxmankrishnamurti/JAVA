import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("Enter row value : ");

//        Pattern :- 01

        Scanner in = new Scanner(System.in);
//        int star1 = in.nextInt();
//
//        for (int i = 0; i < star1; i++){
//            for (int j = 0; j < (i + 1); j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

//        Pattern - 02

//        int star2 = in.nextInt();
//        for (int i = 0; i < star2; i++){
//            for (int j = 0; j < (star2 - i); j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        int star3 = in.nextInt();
        for (int i = 0; i < star3; i++){
            int space = (star3 - i);
            while (space > 0){
                System.out.print(" ");
                space--;
            }

            for (int j = 0; j < (i + 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

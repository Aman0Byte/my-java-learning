import java.util.Random;
import java.util.Scanner;
public class _20_rockpapergame {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // User is giving the input.
    System.out.println("HEY BUDDY ARE YOU SURE TO PLAY THIS GAME IF YES THE ENTER TRUE , ELSE FOR LEAVE THIS GAME ENTER FALSE ");
    boolean b = sc.nextBoolean();
    if (b)
    {

        System.out.println("It's Your turn, \nPlease choose your choice : ");
        Random rand = new Random();
        int i = 1;
        System.out.println("PRESS 0 FOR ROCK \nPRESS 1 PAPER \nPRESS 2 FOR  SCISSOR");
        while (i >= 0) {
            int Your_Turn, Computer_Turn;

            Your_Turn = sc.nextInt();
            if (Your_Turn <= 2) {
                //Computer is giving the input.
                Computer_Turn = rand.nextInt(3);

                System.out.print("You choosed : ");
                switch (Your_Turn) {
                    case 0 ->System.out.println("Rock");
                    case 1 ->System.out.println("Paper");
                    case 2-> System.out.println("Scissor");
                }
                System.out.print("Computer choosed : ");
                if (Computer_Turn == 0) {
                    System.out.println("Rock");
                } else if (Computer_Turn == 1) {
                    System.out.println("Paper");
                } else if (Computer_Turn == 2) {
                    System.out.println("Scissor");
                }

                System.out.println("Here is the winner : ");
                if (Your_Turn == 0 && Computer_Turn == 1) {
                    System.out.println("Oops! The computer won. Better luck next time");
                } else if (Your_Turn == 1 && Computer_Turn == 2) {
                    System.out.println("Oops! The computer won. Better luck next time");
                } else if (Your_Turn == 2 && Computer_Turn == 0) {
                    System.out.println("Oops! The computer won. Better luck next time");
                } else if (Your_Turn == 1 && Computer_Turn == 0) {
                    System.out.println("Congratulations! You won!");
                } else if (Your_Turn == 2 && Computer_Turn == 1) {
                    System.out.println("Congratulations! You won!");
                } else if (Your_Turn == 0 && Computer_Turn == 2) {
                    System.out.println("Congratulations! You won!");
                } else if (Your_Turn == 0 && Computer_Turn == 0 || Your_Turn == 1 && Computer_Turn == 1 || Your_Turn == 2 && Computer_Turn == 2) {
                    System.out.println("Sorry, the match is drawn. Please play again.");
                }
                i++;
                System.out.println("PLAY AGAIN , ENTER OUR CHOICE ");
            } else {
                System.out.println("WRONG CHOICE PLEASE CHOOSE A RIGHT OPTION  ");
            }

        }
    }
    else {
        System.out.println(" FIR AANA BUDDY I AM WAITING ");
    }
}
}




//   System.out.println("Enter 0 for rock, 1 for paper, 2 for scissor : ");
//Scanner sc = new Scanner(System.in);
//int humanInput = sc.nextInt();
//
//Random random = new Random();
//int compInput = random.nextInt(3);
//        if(humanInput<=2){
//        System.out.println("Game Starts");
//        }
//                else {
//                System.out.println("Invalid user input");
//            return;
//                    }
//                    if (humanInput == compInput) {
//        System.out.println("Draw again!");
//        } else if (humanInput == 0 && compInput == 2 || humanInput == 1 && compInput == 0 || humanInput == 2 && compInput == 1) {
//        System.out.println("You win");
//
//        } else {
//                System.out.println("Computer wins!");
//        }
//
//                System.out.println("Comp choice :" + compInput);

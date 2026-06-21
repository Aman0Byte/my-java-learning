import java.util.Scanner;
import java.util.Random;
public class _41_ch09_solution_and_shoutouts {
    public static void main(String[] args) {

        System.out.println("Enter 0 for rock, 1 for paper, 2 for scissor : ");
        Scanner sc = new Scanner(System.in);
        int humanInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);
        if(humanInput<=2){
            System.out.println("Game Starts");
        }
        else {
            System.out.println("Invalid user input");
            return;
        }
        if (humanInput == computerInput) {
            System.out.println("Draw again!");
        } else if (humanInput == 0 && computerInput == 2 || humanInput == 1 && computerInput == 0 || humanInput == 2 && computerInput == 1) {
            System.out.println("You win");

        }
        if (computerInput==0)
            System.out.println("computer choice Rock");
        else if (computerInput==1) {
            System.out.println(" computer choice Paper");

        } else if (computerInput==2) {
            System.out.println(" computer choice Scissor");

        }


    }
}

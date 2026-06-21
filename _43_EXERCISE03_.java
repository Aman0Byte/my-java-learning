import java.util.Scanner;
import java.util.Random;
class Game{
    private int User_guess, Computer_input, no_of_guess=0;

    public Game(){
        Random random= new Random();
        Computer_input= random.nextInt(10);
    }

    public void setUser_guess(int user_guess) {
        User_guess = user_guess;
    }
    public boolean IsCorrect(){
        if (User_guess> Computer_input){
            System.out.println("HEY BUDDY YOU GUESS BIG NUMBER , TRY AGAIN ");
            no_of_guess= no_of_guess+1;
            return false;
        } else if (Computer_input> User_guess) {
            System.out.println("HEY BUDDY YOU GUESS SMALL NUMBER , TRY AGAIN ");
            no_of_guess= no_of_guess+1;
            return false;
        }
        else {
            System.out.println("CONGRATULATION YOU GUESS  SAME NUMBER ");
            no_of_guess= no_of_guess+1;
            System.out.println("YOU GUESS RIGHT NUMBER IN "+no_of_guess+" ATTEMPT");
            return true;
        }
    }
}
public class _43_EXERCISE03_ {
    public static void main(String[] args) {
        Game Player  = new Game();
        Scanner scanner= new Scanner(System.in);
        System.out.println("ENTER TRUE  IF YOU WANT TO PLAY THE NUMBER GUESSING GAME ,  YOU CAN ENTER FALSE FOR LEAVE THIS GAME  ");
        boolean b = scanner.nextBoolean();
        if (b) {
            System.out.println("NUMBER GUESSING GAME IS START ");
            System.out.println("PLEASE GUESS THE NUMBER ");
            Player.setUser_guess(scanner.nextInt());
            while (!Player.IsCorrect()) {
                System.out.println("PLEASE GUESS AGAIN ");
                Player.setUser_guess(scanner.nextInt());
            }
        }
        else {
            System.out.println(" THANKS BUDDY FIR ANA");
        }
    }
}
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

class TicTacTeo{
  static   char [][] board;
    public TicTacTeo()
    {
        board = new char[3][3];
        intiBoard();

    }
    void intiBoard(){
        for (int row= 0 ; row< board.length ; row++)
        {
            for (int col = 0 ; col < board[row].length; col++)
            {
                board[row][col]= ' ';
            }
        }
    }
  static   void displayBoard(){
        System.out.println("-------------");
        for (int row= 0 ; row< board.length ; row++)
        {
            System.out.print("| ");
            for (int col=0 ; col < board[row].length; col++)
            {
                System.out.print(board[row][col] + " | ");

            }
            System.out.println();
            System.out.println("-------------");
        }
    }
    static void placeMark(int row , int col , char mark){
      if (row>=0&& row<=2 && col<=2&& col>=0) {
          board[row][col] = mark;
      }
      else {
          System.out.println("Invalid Position ");
      }
    }
   static boolean colWinCheck() {
        for ( int col = 0; col <= 2; col++) {
            if ( board[0][col]!=' ' &&     board[0][col] == board[1][col] && board[1][col] == board[2][col]) {
                return true;
            }

        }
        return false;
}
static boolean rowWinCheck(){
        for (int i=0 ; i<= 2 ; i++){
        if ( board[i][0] != ' '  &&  board[i][0]==board[i][1] &&  board[i][1]==board[i][2] ){
            return true;
        }

        }
        return false;
}
static boolean daiWinCheck(){
                if (board[0][0] != ' '&&  board[0][0] == board[1][1]  && board[1][1] == board[2][2]  ||  board[0][2]!=' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]){
                    return true;
        }
                else
        return false;
}
}


class HumanPlayer{
    String name;
    char mark;
    HumanPlayer(String name , char mark){
        this.mark= mark;
        this.name= name;
    }
void  makeMove(){
        int row;
        int col;
    Scanner scanner = new Scanner(System.in);
   do {
       System.out.println("Enter the Row And Col ");
       row = scanner.nextInt();
       col= scanner.nextInt();

   }while (!isValidMove(row,col));
TicTacTeo.placeMark(row,col,mark);

}

    boolean isValidMove(int row , int col ){
        if(row>=0  && row <=2 && col>=0 && col<=2 ) {
            if (TicTacTeo.board[row][col] == ' ') {
                return true;
            }
        }
        return false;
    }



}
public class _Tek_Tac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name1;
        String Name2;
        char mark1;
        char mark2;
        System.out.println("Please enter 1st Player's Name ");
        Name1 = sc.next();
        System.out.println("Please enter 1st Player's Mark ");
        mark1= sc.next().charAt(0);
        System.out.println("Please enter 2nd Player's Name ");
        Name2 = sc.next();
        System.out.println("Please enter 2nd Player's Mark ");
        mark2= sc.next().charAt(0);
TicTacTeo t = new TicTacTeo();
HumanPlayer p1 = new HumanPlayer( Name1, mark1);
HumanPlayer p2 = new HumanPlayer(Name2, mark2);
HumanPlayer cp;
cp = p1;
while (true){
    System.out.println(cp.name + " Your Turn ");
    cp.makeMove();
    TicTacTeo.displayBoard();
    if (TicTacTeo.colWinCheck() || TicTacTeo.daiWinCheck()|| TicTacTeo.rowWinCheck()){
        System.out.println(cp.name+" Has won");
break;
    }
    else {
        if (cp==p1){
            cp= p2;
        }
        else {
            cp= p1;
        }
    }
}
    }
}

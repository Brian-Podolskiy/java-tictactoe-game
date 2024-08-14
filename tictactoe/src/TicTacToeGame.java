import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args)
    {
        TicTacToe game = new TicTacToe();
        Scanner in = new Scanner(System.in);
        int rowChoice, colChoice = 0;
        int currentPlayer = 1;
        boolean valid = false;

        System.out.println("Initial Game Board:");
        game.printBoard();

        while (game.checkWin() != true){
            System.out.println("Player " + currentPlayer + " turn: ");
            while (valid == false){
                System.out.println("Column: ");
                rowChoice = in.nextInt();
                System.out.println("Row: ");
                colChoice = in.nextInt();
                if (game.pickLocation(rowChoice, colChoice) == true){
                    game.takeTurn(rowChoice, colChoice);
                    valid = true;
                }
                else{
                    System.out.println("Not a valid choice! Try again: ");
                    game.printBoard();
                }
            }
            valid = false;
            if (currentPlayer == 1){
                currentPlayer++;
            }
            else{
                currentPlayer--;
            }
            System.out.println("New Board: ");
            game.printBoard();
            game.checkWin();
            
        }
        
    }

        /*
        //Prints the first row of turns taken
        for(int row = 0; row < 3; row++)
        {
            if(game.pickLocation(0, row))
            {
                game.takeTurn(0, row);
            }
        }
        System.out.println("\nAfter three turns:");
        game.printBoard();
        //System.out.println(game.checkWin());
        
        */
    
}
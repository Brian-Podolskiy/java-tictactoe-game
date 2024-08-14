public class TicTacToe
{
   //copy over your constructor from the Tic Tac Toe Board activity in the previous lesson!
   private int turn;
   
   private String[][] board;
    public TicTacToe(){
        String[][] ttt = new String[3][3];
        for (int i = 0; i < ttt.length; i++){
            for (int j = 0; j < ttt[i].length; j++){
                ttt[i][j] = "-";
            }
        }
        board = ttt;
    }
   
   //this method returns the current turn
   public int getTurn()
   {
       return turn;
   }
   
   /*This method prints out the board array on to the console
   */
   public void printBoard()
    {
        System.out.print(" ");
        System.out.print(" ");
        for (int i = 0; i < board[0].length; i++){
            System.out.print(i);
            System.out.print(" ");
        }
        
        System.out.println();
        for (int row = 0; row < board.length; row++){
            System.out.print(row);
            for (int col = 0; col < board[0].length; col++){
                System.out.print(" ");
                System.out.print(board[row][col]);
            }
            System.out.println();
        }
    }
   //This method returns true if space row, col is a valid space
   public boolean pickLocation(int row, int col)
   {
       if (row > 2 || col > 2){
           return false;
       }
       else if (board[row][col].equals("X") || board[row][col].equals("O")){
           return false;
       }
       else{
           return true;
       }
   }
   
   //This method places an X or O at location row,col based on the int turn
   public void takeTurn(int row, int col)
   {
       if (turn % 2 == 0){
           board[row][col] = "X";
       }
       else{
           board[row][col] = "O";
       }
       turn++;
   }
   
   //This method returns a boolean that returns true if a row has three X or O's in a row
   public boolean checkRow()
   {
       //boolean rowWin = false;
       for (int row = 0; row < board.length; row++){
           if ((board[row][0].equals("X") || board[row][0].equals("O")) && (board[row][0].equals(board[row][1]) && board[row][0].equals(board[row][2]))){
               return true;
           }
           
       }
       return false;
   }
   
    //This method returns a boolean that returns true if a col has three X or O's
   public boolean checkCol()
   {
       for (int col = 0; col < board[0].length; col++){
           if ((board[0][col].equals("X") || board[0][col].equals("O")) && (board[0][col].equals(board[1][col]) && board[0][col].equals(board[2][col]))){
               return true;
           }
       }
       return false;
   }
   
    //This method returns a boolean that returns true if either diagonal has three X or O's
   public boolean checkDiag()
   {
       if ((board[1][1].equals("X") || board[1][1].equals("O")) && (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]))){
           return true;
       }
       return false;
   }
   
   //This method returns a boolean that checks if someone has won the game
   public boolean checkWin()
   {
       if (checkCol() || checkRow() || checkDiag()){
            return true;
       }
       return false;
   }

}
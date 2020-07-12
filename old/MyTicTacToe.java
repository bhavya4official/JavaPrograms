import javax.swing.JFrame;


public class MyTicTacToe 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
   {
        // TODO code application logic here
      JFrame tictactoe=new TicTac();
      tictactoe.setTitle("Tic Tac Toe");
      tictactoe.setSize(600,600);
      tictactoe.setLocationRelativeTo(null);
      tictactoe.setVisible(true);
      
        
    }
    
}

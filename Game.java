package game;

    import java.util.Scanner;



    public class Game {

        public static void main(String[] args) {
       
            //Declare constants.
            final int ROCK = 1;
            final int SCISSORS = 2;
            final int PAPER = 3;
        
            //Create scanner object.
            Scanner scannerObject = new Scanner(System.in);
      
             // Promt player1 to choose rock, paper, or scissors.
            System.out.print("Player 1: Choose (1) - Rock, (2) - Scissors, or (3) - Paper: ");
             
             //Accept player1 input.
             int player1 = scannerObject.nextInt();
             
             
             
             //Promt player2 to choose rock, paper, or scissors. 
            System.out.print("Player 2: Choose (1) - Rock, (2) - Scissors, or (3) - Paper; ");
              
             //Accept player2 input.
             int player2 = scannerObject.nextInt();
             
             
            if (player1 == player2) 
                System.out.println("It is a tie!");
                
             else if (player1 == ROCK) {
                if (player2 == SCISSORS) 
                    System.out.println("Rock smashes scissors. Player 1 wins");
                else 
                    System.out.println("Paper covers rock. Player 2 wins");
                }
              
            
                
             else if (player1 == PAPER) {
                if (player2 == ROCK) 
                    System.out.println("Paper covers rock. Player 1 wins");
                else 
                    System.out.println("Scissors cuts paper. Player 2 wins!");
                
             }
                
             else if (player1 == SCISSORS) {
                if (player2 == PAPER) 
                    System.out.println("Scissors cuts paper. Player 1 wins!");
                else 
                    System.out.println("Rock smashes scissors. Player 2 wins!");
                
                }
             }

        }
        
  
             
             
             
        

    


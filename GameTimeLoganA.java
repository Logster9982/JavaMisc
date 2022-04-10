import java.util.Scanner;
public class GameTimeLoganA {
/**
  GameTime is a menu to choose games for the user

  Logan A.
  Block 2
  Last Update: 06/10/2021
**/
  public static void main (String [] args){
  runMenu();
  }
  public static void runMenu(){
    System.out.println("Welcome to GameTime");
    String choice;
    Scanner in = new Scanner(System.in);


    while (true){
      System.out.println("(M)akeStory");
      System.out.println("(W)ordGuesser");
      System.out.println("(N)umberGuess");
      System.out.println("(E)Exit");
      System.out.println("Type the letter of the game you would like to play and press \"Enter\"");
      choice = in.nextLine();

      if (choice.equals("E")){
        break;
      } else if (choice.equals("W")){
        WordGuesser.playGame();
      } else if (choice.equals("M")){
        WordReplace.storyTime();
      } else if (choice.equals("N")){
        NumberGuess.startGame();
      }
    } 
    System.out.println("Thank you for playing!");
  }
}

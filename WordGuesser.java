import java.util.Scanner;
public class WordGuesser {
  public static void main(String[] args) {
    for (int number = 0; number < 15; number++) {
      playGame();
    }
  }

  public static int getNumInRange(int low, int high) {
    return (int)(Math.random()*(high-low+1)+low); 
  }

  public static String getRandomWord() {
    String[] wordList = {"guess", "vs", "against", "date", "time", "laughable", "wait", "copy", "paste", "ten", "bracket", "python", "reference", "keyboard", "sailor"};
    return wordList[getNumInRange(0, wordList.length-1)];
  }

  public static void playGame() {
    String wordToGuess= getRandomWord();
    // System.out.println(wordToGuess);  DEBUG

    String maskedWord = "";
    for (int i = 0; i < wordToGuess.length(); i++){
      maskedWord += "?";
    }

    System.out.println("\n I have generated a word. Can you guess it?");
    

    //declare and innitialize variables for loop
    int missesLeft = 3;
    String lettersGuessed = "";
    Scanner in = new Scanner(System.in);

    while (missesLeft !=0 && !maskedWord.equals(wordToGuess)){
      System.out.println("Word to guess: " + maskedWord);
      System.out.print("Guess a letter: ");
      String guess= in.nextLine();

      lettersGuessed += guess;
      boolean goodGuess = false;

      for (int i = 0; i < wordToGuess.length(); i++) {
        String curLetter = wordToGuess.substring(i,i+1);

        if (guess.equals(curLetter)){
          maskedWord = maskedWord.substring(0,i) +
          curLetter +
          maskedWord.substring(i+1);
          goodGuess = true;
        }
      }

      if (!goodGuess){
        missesLeft--;
      }
      //statistics
      System.out.println("You have guessed: |" + lettersGuessed + "| " + missesLeft + " guesses remaining.");
      
    }
  
  if (wordToGuess.equals(maskedWord)){
    System.out.print("You guessed it!");
  } else {
    System.out.print("Too bad, you missed it. Maybe next time?");
  }
  System.out.println(" The word was " + wordToGuess + ".");
  }
}

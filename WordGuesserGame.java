public class WordGuesser {
  public static void main(String[] args) {
    for (int number = 0; number < 15; number++) {
      playGame();
    }
  }

  public static int getNumInRange(int low, int high) {
    return (int)(Math.random()*(high-low+1)+low); 
  }

  public static String getRandomWords() {
    String[] words = {"guess", "vs", "against", "date", "time", "laughable", "wait", "copy", "paste", "ten", "bracket", "python", "reference", "keyboard", "sailor"};
    return words[getNumInRange(0, words.length-1)];
  }

  public static void playGame() {
    System.out.println(getRandomWords());
  }
}

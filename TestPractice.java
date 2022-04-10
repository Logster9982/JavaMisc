public class TestPractice {
  public static int getIndexOfShortestWord(String [] args) {
    // look at each word
    int indexOfShortest = 0;
    for (int i = 0; i < args.length; i++){
      if (args[i].length < args[indexOfShortest].length()) {
        indexOfShortest = i;
      }
    }
    return 0;
  }
  public static void main (String [] args) {
    String [] words = {"Red","Orange","Yellow","Blue"};
    System.out.println (words[getIndexOfShortestWord(words)]);

  }
}
import java.util.Scanner;
public class BiggestAndSmallest {
  public static void main (String [] args) {
    int x;
    Scanner in = new Scanner(System.in);
    System.out.print("How many Numbers are there: ");
    x = in.nextInt();
    int biggest = -420000000; // used for storing, the answer will replace it.
    int smallest = 420000000; // used for storing, the answer will replace it.

    while (x != 0){
      int num = in.nextInt();
      if (num > biggest) {
        biggest = num;
      }

      if (num < smallest) {
        smallest = num; // replaces the answer
      }
      x = x - 1; // stops the loop
    }

    System.out.println("Biggest is " + biggest + " and smallest is " + smallest);
  }
}
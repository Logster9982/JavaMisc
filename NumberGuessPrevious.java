import java.util.Scanner;
public class NumberGuessPrevious{
 public static void main(String [] args){
   int answer = (getNumInRange(1,10));
   playGame(answer);
 }


 public static int getNumInRange(int low, int high) {
   return (int)(Math.random()*(high-low+1)+low);
 }

 public static int getGuess(int low, int high){
   return 0;
 }

 public static void playGame(int answer) {
  Scanner in = new Scanner(System.in);
  int guess;
  System.out.print("Guess a number between 1 and 10: ");
 // System.out.println(answer); <- This was used for debugging.
 if (!in.hasNextInt()) {
  String word = in.next();
  System.err.println(word + " is not a number! ");
  playGame(answer); }
  guess = in.nextInt();
  if (guess==answer) {
   System.out.println("You Win");
   } 
   else  if (guess<answer){
     System.out.println("Your number is too small, try again.");
     playGame(answer); }
     else if (guess>answer) {
     System.out.println("Your number is too big, try again.");
     playGame(answer); }

     }
    
   }



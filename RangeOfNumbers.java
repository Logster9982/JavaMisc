/**
  Block 2

  Logan A.
  Last Update: 5/20/2021
**/
import java.util.Scanner;
public class RangeOfNumbers {
  public static void main (String [] args) {
    int number1;
    int number2;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter first number: ");
    number1 = in.nextInt();
    System.out.print("Enter second number: ");
    number2 = in.nextInt();    

    if (number1 > number2) {
      System.out.print(number1);
      while (number1 != number2) {
        number1 = number1 - 1;
        System.out.print(number1);
      }
    }
    else if (number2 > number1) {
      System.out.print(number1);
      while (number1 != number2) {
        number1 = number1 + 1;
        System.out.print(number1);

      } } else if (number1 == number2) {
      System.out.print(number1);
      }
    
  }
}
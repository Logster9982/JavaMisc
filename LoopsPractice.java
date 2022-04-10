import java.util.Scanner;
public class LoopsPractice {
  public static void main (String [] args) {
  System.out.print("For loop 1 to 10 by ones: ");
  for (int x = 1; x <= 10; x = x+1) {
    System.out.print(x + " ");
    }

  System.out.print("\n while loop 1 to 10 by ones: ");
  int y = 1;
  while (y < 11){
    System.out.print(y + " ");
    y++; // Same as y = y + 1
  
  }

  System.out.print("\n For loop 10 to 100 by tens: ");
  for (int x = 10; x <= 100; x = x+10) {
    System.out.print(x + " ");
    }


  System.out.print("\n while loop 10 to 100 by tens: ");  
  int w = 10;
  while (w < 101){
    System.out.print(w + " ");
    w += 10; // Same as y = y * 10
  
  }  

  System.out.print("\n For loop 10 to 1 by ones: ");
  for (int x = 10; x >= 1; x = x-1) {
    System.out.print(x + " ");
    }

  System.out.print("\n while loop 10 to 1 by ones: ");
  int z = 10;
  while (z > 0){
    System.out.print(z + " ");
    z -= 1; // Same as z = z + 1
  
  }
  }
}